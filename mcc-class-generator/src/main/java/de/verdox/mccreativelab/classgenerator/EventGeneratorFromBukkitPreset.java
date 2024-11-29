package de.verdox.mccreativelab.classgenerator;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.JavaDocExpression;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.SuperConstructorCall;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.CodeExpression;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter;
import de.verdox.mccreativelab.classgenerator.util.FieldNameUtil;
import de.verdox.mccreativelab.conversion.TypeHierarchyMap;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.event.MCCCancellable;
import de.verdox.mccreativelab.wrapper.event.MCCEvent;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.craftbukkit.block.CraftBlockState;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.block.BlockBreakEvent;
import org.jetbrains.annotations.Nullable;
import org.reflections.Reflections;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.nio.file.Path;
import java.util.*;
import java.util.logging.Logger;

public class EventGeneratorFromBukkitPreset extends AbstractClassGenerator {
    private static final Logger LOGGER = Logger.getLogger(EventGeneratorFromBukkitPreset.class.getSimpleName());
    private final Map<Class<?>, ClassBuilder> DONE = new HashMap<>();
    private static final TypeHierarchyMap<Class<?>> BUKKIT_TO_MCC_MAPPING = new TypeHierarchyMap<>();
    private static final Map<String, Class<?>> BUKKIT_TYPES_KNOWN = new HashMap<>();

    static {
        register(World.class, MCCWorld.class);
        register(Entity.class, MCCEntity.class);
        register(Block.class, MCCBlock.class);
        register(Location.class, MCCLocation.class);
        register(BlockData.class, MCCBlockState.class);
    }

    private static void register(Class<?> bukkitType, Class<?> mccType) {
        BUKKIT_TO_MCC_MAPPING.put(bukkitType, mccType);
        BUKKIT_TYPES_KNOWN.put(bukkitType.getSimpleName(), bukkitType);
    }

    public EventGeneratorFromBukkitPreset(File srcDir, String prefix, String suffix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        super(srcDir, prefix, suffix, excludedTypes, excludedPackages);
    }

    public void generateEventWrappers() throws IOException {
        Reflections reflections = new Reflections("org.bukkit");
        Set<Class<? extends Event>> subtypes = reflections.getSubTypesOf(Event.class);

        for (Class<? extends Event> subtype : subtypes) {
            generateWrapper(subtype);
        }
    }

    private ClassBuilder generateWrapper(Class<?> bukkitEventClass) throws IOException {
        if (DONE.containsKey(bukkitEventClass))
            return DONE.get(bukkitEventClass);

        String packageFolder = bukkitEventClass.getPackageName().replace(".", "/");
        String fileName = bukkitEventClass.getSimpleName();

        Path sourceFileOfEvent = Path.of("../../mccreativelab-api/src/main/java/" + packageFolder + "/" + fileName + ".java");
        if (!sourceFileOfEvent.toFile().exists()) {
            LOGGER.info("Could not find class file of " + bukkitEventClass.getSimpleName());
            return null;
        } else {
            LOGGER.info("Found class file of event " + bukkitEventClass.getSimpleName());
        }

        CompilationUnit cu = StaticJavaParser.parse(sourceFileOfEvent.toFile());
        Map<String, MethodDeclaration> methodDeclarations = new HashMap<>();
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            LOGGER.info(bukkitEventClass.getSimpleName() + " cached method: " + method.getNameAsString());
            methodDeclarations.put(method.getNameAsString(), method);
        });
        ConstructorDeclaration constructorDeclaration = cu.findAll(ConstructorDeclaration.class).stream().findAny().orElseThrow(RuntimeException::new);

        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, prefix + bukkitEventClass.getSimpleName(), "");
        classBuilder.withPackage(bukkitEventClass.getPackageName().replace("org.bukkit.", "de.verdox.mccreativelab.wrapper.").replace("com.destroystokyo.paper.", "de.verdox.mccreativelab.wrapper."));

        cu.findFirst(ClassOrInterfaceDeclaration.class).flatMap(Node::getComment).ifPresent(comment -> {
/*            if (comment.isJavadocComment()) {
                JavaDocExpression javaDocExpression = new JavaDocExpression();
                for (JavadocBlockTag blockTag : comment.asJavadocComment().parse().getBlockTags()) {
                    System.out.println(blockTag.getContent().toText());
                    javaDocExpression.withText(blockTag.getContent().toText());
                }
            }*/
            classBuilder.javaDoc(JavaDocExpression.fromComment(comment));
        });


        List<Parameter> superConstructorParameters = new LinkedList<>();
        if (Event.class.isAssignableFrom(bukkitEventClass.getSuperclass())) {
            if (Event.class.equals(bukkitEventClass.getSuperclass())) {
                classBuilder.implementsClasses(DynamicType.of(MCCEvent.class));
            } else {
                ClassBuilder parent = generateWrapper(bukkitEventClass.getSuperclass());
                if (parent == null) {
                    LOGGER.warning("Could not generate mcc event for bukkit event " + bukkitEventClass.getCanonicalName() + " because the wrapper for the super type " + bukkitEventClass.getSuperclass().getCanonicalName() + " could not be generated");
                    return null;
                }
                classBuilder.extendsClasses(DynamicType.of(parent.getClassDescription()));
                if (!parent.getConstructors().isEmpty()) {
                    superConstructorParameters.addAll(parent.getConstructors().get(0).parameters());
                }
            }
        }

        List<Parameter> constructorParametersForFinalFields = new LinkedList<>();
        for (Field declaredField : bukkitEventClass.getDeclaredFields()) {
            if (Modifier.isStatic(declaredField.getModifiers())) {
                continue;
            }

            if ((declaredField.getName().contains("cancel") || declaredField.getName().contains("Cancel")) && (declaredField.getType().equals(Boolean.class) || declaredField.getType().equals(boolean.class))) {
                classBuilder.implementsClasses(DynamicType.of(MCCCancellable.class));

                classBuilder.withField("private", DynamicType.of(boolean.class), "cancelled", (CodeExpression) null);

                classBuilder.withMethod(
                    new de.verdox.mccreativelab.classgenerator.codegen.expressions.Method()
                        .name("isCancelled")
                        .type(DynamicType.of(boolean.class))
                        .code(code -> code.append("return ").append("cancelled").appendAndNewLine(";"))
                );

                classBuilder.withMethod(
                    new de.verdox.mccreativelab.classgenerator.codegen.expressions.Method()
                        .name("setCancelled")
                        .code(code -> code.append("this.").append("cancelled = cancelled").appendAndNewLine(";"))
                        .parameter(new Parameter(DynamicType.of(boolean.class), "cancelled"))
                );

                /*classBuilder.withMethod("public", "isCancelled", DynamicType.of(boolean.class), code -> code.append("return ").append("cancelled").appendAndNewLine(";"));
                classBuilder.withMethod("public", "setCancelled", null, code -> code.append("this.").append("cancelled = cancelled").appendAndNewLine(";"), new Parameter(DynamicType.of(boolean.class), "cancelled"));*/
            } else {
                DynamicType fieldType = swapBukkitWithMCC(DynamicType.of(declaredField.getGenericType()));
                if (fieldType == null) {
                    LOGGER.warning("Could not generate mcc event for bukkit event " + bukkitEventClass.getCanonicalName() + " because there is no mcc type for the bukkit type " + DynamicType.of(declaredField.getGenericType()));
                    return null;
                }
                String modifier = Modifier.isFinal(declaredField.getModifiers()) ? "private final" : "private";
                classBuilder.withField(modifier, fieldType, declaredField.getName(), (CodeExpression) null);

                Method bukkitGetter = findBukkitGetterMethodForField(bukkitEventClass, declaredField, cu, methodDeclarations);

                if (bukkitGetter != null) {
                    JavaDocExpression javaDocExpression = methodDeclarations.get(bukkitGetter.getName()).getComment().map(JavaDocExpression::fromComment).orElse(null);
                    classBuilder.withMethod(
                        new de.verdox.mccreativelab.classgenerator.codegen.expressions.Method()
                            .name(bukkitGetter.getName())
                            .type(fieldType)
                            .code(code -> code.append("return ").append(declaredField.getName()).appendAndNewLine(";"))
                            .javaDoc(javaDocExpression)
                    );
                } else {
                    LOGGER.info("Could not generate getter for " + declaredField.getName());
                }

/*                String getterName = "get" + FieldNameUtil.capitalize(declaredField.getName());
                if (Boolean.class.equals(fieldType.getRawType()) || boolean.class.equals(fieldType.getRawType())) {
                    getterName = "is" + FieldNameUtil.capitalize(declaredField.getName());
                }*/

/*                classBuilder.withMethod(
                    new de.verdox.mccreativelab.classgenerator.codegen.expressions.Method()
                        .name(getterName)
                        .type(fieldType)
                        .code(code -> code.append("return ").append(declaredField.getName()).appendAndNewLine(";"))
                );*/

                /*classBuilder.withMethod("public", getterName, fieldType, code -> {
                    code.append("return ").append(declaredField.getName()).appendAndNewLine(";");
                });*/

                if (!Modifier.isFinal(declaredField.getModifiers())) {
                    //TODO: Create setter

                    Method bukkitSetter = findBukkitSetterMethodForField(bukkitEventClass, declaredField, cu, methodDeclarations);

                    if (bukkitSetter != null) {
                        JavaDocExpression javaDocExpression = methodDeclarations.get(bukkitSetter.getName()).getComment().map(JavaDocExpression::fromComment).orElse(null);

                        classBuilder.withMethod(
                            new de.verdox.mccreativelab.classgenerator.codegen.expressions.Method()
                                .name(bukkitSetter.getName())
                                .code(code -> code.append("this.").append(declaredField.getName()).append(" = ").append(declaredField.getName()).appendAndNewLine(";"))
                                .parameter(new Parameter(fieldType, declaredField.getName()))
                                .javaDoc(javaDocExpression)
                        );
                    } else {
                        LOGGER.info("Could not generate setter for " + declaredField.getName());
                    }
                }
                constructorParametersForFinalFields.add(new Parameter(fieldType, declaredField.getName()));
            }
        }

        List<Parameter> constructorArgs = new LinkedList<>();
        constructorArgs.addAll(superConstructorParameters);
        constructorArgs.addAll(constructorParametersForFinalFields);

        classBuilder.withConstructor(
            new de.verdox.mccreativelab.classgenerator.codegen.expressions.Constructor()
                .parameter(constructorArgs.toArray(Parameter[]::new))
                .code(code -> {
                    code.append(new SuperConstructorCall(superConstructorParameters.toArray(Parameter[]::new)));
                    for (Parameter parameter : constructorParametersForFinalFields) {
                        code.append("this.").append(parameter.name()).append(" = ").append(parameter.name()).appendAndNewLine(";");
                    }
                })
        );

        classBuilder.writeClassFile(srcDir);
        DONE.put(bukkitEventClass, classBuilder);
        LOGGER.info("Generated event " + classBuilder.getClassName() + " from bukkit event " + bukkitEventClass.getSimpleName());
        return classBuilder;
    }

    @Nullable
    private Method findBukkitSetterMethodForField(Class<?> bukkitClass, Field field, CompilationUnit readSourceCodeFile, Map<String, MethodDeclaration> foundMethods) {
        for (Method declaredMethod : bukkitClass.getDeclaredMethods()) {
            if (declaredMethod.getParameters().length != 1) {
                continue;
            }
            MethodDeclaration methodDeclaration = foundMethods.get(declaredMethod.getName());
            if (methodDeclaration != null) {
                LOGGER.warning("Checking cached method: " + declaredMethod.getName());
                boolean containsThisStatement = containsAssignmentToThisField(methodDeclaration, field.getName());

                if (containsThisStatement || declaredMethod.getName().equals("set"+FieldNameUtil.capitalize(field.getName()))) {
                    LOGGER.info("Found match!");
                    return declaredMethod;
                } else {
                    LOGGER.info("No match. Continue searching...");
                }
            } else {
                LOGGER.warning("Declared method " + declaredMethod.getName() + " was not cached");
            }
        }
        return null;
    }

    @Nullable
    private Method findBukkitGetterMethodForField(Class<?> bukkitClass, Field field, CompilationUnit readSourceCodeFile, Map<String, MethodDeclaration> foundMethods) {
        for (Method declaredMethod : bukkitClass.getDeclaredMethods()) {
            if (declaredMethod.getParameters().length != 0) {
                continue;
            }
            MethodDeclaration methodDeclaration = foundMethods.get(declaredMethod.getName());
            if (methodDeclaration != null) {
                LOGGER.warning("Checking cached method: " + declaredMethod.getName());
                boolean containsReturn = containsReturnStatement(methodDeclaration, field.getName());

                if (containsReturn || declaredMethod.getName().equals("get" + FieldNameUtil.capitalize(field.getName())) || declaredMethod.getName().equals("is" + FieldNameUtil.capitalize(field.getName()))) {
                    LOGGER.info("Found match!");
                    return declaredMethod;
                } else {
                    LOGGER.info("No match. Continue searching...");
                }
            } else {
                LOGGER.warning("Declared method " + declaredMethod.getName() + " was not cached");
            }
        }
        return null;
    }

    @Nullable
    public static DynamicType swapBukkitWithMCC(DynamicType dynamicType) {
        Class<?> rawType = dynamicType.getRawType();
        if (rawType == null) {
            return null;
        }

        Class<?> foundBukkitMapping = BUKKIT_TO_MCC_MAPPING.get(rawType);

        DynamicType swappedType = null;
        if (foundBukkitMapping != null) {
            swappedType = DynamicType.of(foundBukkitMapping, false);
        } else if (!rawType.getPackageName().contains("org.bukkit")) {
            swappedType = dynamicType;
        } else {
            return null;
        }

        swappedType = swappedType.withNoGenerics();
        for (DynamicType genericType : dynamicType.getGenericTypes()) {
            DynamicType swappedGeneric = swapBukkitWithMCC(genericType);
            if (swappedGeneric == null)
                return null;
            swappedType = swappedType.withAddedGeneric(swappedGeneric);
        }
        return swappedType;
    }


    private static boolean containsReturnStatement(MethodDeclaration method, String variable) {
        return method.getBody()
            .map(body -> body.findAll(ReturnStmt.class).stream()
                .anyMatch(returnStmt -> returnStmt.getExpression().isPresent() && isMatchingExpression(returnStmt.getExpression().get(), variable)))
            .orElse(false);
    }

    // Hilfsmethode, um verschiedene Ausdruckstypen zu prüfen
    private static boolean isMatchingExpression(Expression expr, String variable) {
        if (expr.isNameExpr()) {
            // Name Call, e.g. 'previousLocation'
            return expr.asNameExpr().getNameAsString().equals(variable);
        } else if (expr.isFieldAccessExpr()) {
            // Field Access, e.g. 'this.previousLocation'
            FieldAccessExpr fieldAccess = expr.asFieldAccessExpr();
            return fieldAccess.getScope().isThisExpr() && fieldAccess.getNameAsString().equals(variable);
        } else if (expr.isMethodCallExpr()) {
            // MethodCall, e.g. 'previousLocation.clone()'
            MethodCallExpr methodCall = expr.asMethodCallExpr();
            return methodCall.getScope()
                .filter(scope -> isMatchingExpression(scope, variable)) // Basis des Methodenaufrufs prüfen
                .isPresent();
        }
        return false;
    }


    private static boolean containsAssignmentToThisField(MethodDeclaration method, String fieldName) {
        return method.getBody()
            .map(body -> body.findAll(AssignExpr.class).stream()
                .anyMatch(assignExpr -> {
                    Expression target = assignExpr.getTarget();
                    return (target.isFieldAccessExpr() && target.asFieldAccessExpr().getNameAsString().equals(fieldName) &&
                        target.asFieldAccessExpr().getScope().isThisExpr())
                        || (target.isNameExpr() && target.asNameExpr().getNameAsString().equals(fieldName));
                }))
            .orElse(false);
    }
}
