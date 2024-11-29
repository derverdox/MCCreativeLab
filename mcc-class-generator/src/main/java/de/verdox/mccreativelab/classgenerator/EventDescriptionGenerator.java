package de.verdox.mccreativelab.classgenerator;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.*;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.wrapper.event.EventArgument;
import de.verdox.mccreativelab.wrapper.event.PlatformEventWrapper;
import io.papermc.paper.event.player.PlayerPurchaseEvent;
import io.papermc.paper.network.ConnectionEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class EventDescriptionGenerator extends AbstractClassGenerator {

    public EventDescriptionGenerator(File srcDir) {
        super(srcDir, "", "", List.of(), List.of());
    }

    public void generate(int amount) throws IOException {

        ClassBuilder[] descriptionClasses = new ClassBuilder[amount];
        ClassBuilder[] builderClasses = new ClassBuilder[amount];

        for (int i = 0; i < amount; i++) {
            ClassBuilder classBuilder = new ClassBuilder();
            classBuilder.includeImport(DynamicType.of(TypeToken.class));
            classBuilder.withPackage("de.verdox.mccreativelab.wrapper.event.description");
            classBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, "EventDescription" + i, "");
            descriptionClasses[i] = classBuilder;


            ClassBuilder builder = new ClassBuilder();
            builder.withPackage("de.verdox.mccreativelab.wrapper.event.description");
            builder.withHeader("public static", ClassBuilder.ClassHeader.CLASS, "Builder", "");
            builderClasses[i] = builder;

            classBuilder.includeInnerClass(builder);
        }

        ClassBuilder interfaceBuilder = new ClassBuilder();
        interfaceBuilder.includeImport(DynamicType.of(TypeToken.class));
        interfaceBuilder.includeImport(DynamicType.of(PlatformEventWrapper.class));
        interfaceBuilder.includeImport(DynamicType.of(EventArgument.class));
        interfaceBuilder.withPackage("de.verdox.mccreativelab.wrapper.event.description");
        interfaceBuilder.withHeader("public", ClassBuilder.ClassHeader.INTERFACE, "EventDescription", "");

        interfaceBuilder.withMethod(
            new Method()
                .modifier("public static")
                .generic(new GenericDeclaration("T" + 0, null))
                .name("with")
                .type(DynamicType.of(builderClasses[0].getClassDescription()).withAddedGeneric(genericType(0)))
                .code(code -> code.append("return ").append(new ConstructorCall(DynamicType.of(builderClasses[0].getClassDescription()), CodeExpression.create().with("t0"))).append(";"))
                .parameter(new Parameter(DynamicType.of(TypeToken.class).withAddedGeneric(genericType(0)), "t" + (0)))
        );

/*        interfaceBuilder.withMethod("public static", List.of(new GenericDeclaration("T" + 0, null)), "with", DynamicType.of(builderClasses[0].getClassDescription()).withAddedGeneric(genericType(0)), code -> {
            code.append("return ").append(new ConstructorCall(DynamicType.of(builderClasses[0].getClassDescription()), CodeExpression.create().with("t0"))).append(";");
        }, new Parameter(DynamicType.of(TypeToken.class).withAddedGeneric(genericType(0)), "t" + (0)));*/

        interfaceBuilder.writeClassFile(srcDir);

        for (int i = 0; i < amount; i++) {
            int argIndex = i;
            ClassBuilder classBuilder = descriptionClasses[argIndex];


            classBuilder.withField("protected final", DynamicType.of(TypeToken.class).withAddedGeneric(genericType(argIndex)), "t" + argIndex, (CodeExpression) null);

            if (i > 0) {
                DynamicType parent = DynamicType.of(descriptionClasses[i - 1].getClassDescription());
                for (int arg = 0; arg < argIndex; arg++) {
                    parent = parent.withAddedGeneric(genericType(arg));
                }
                classBuilder.extendsClasses(parent);
            } else {
                classBuilder.implementsClasses(DynamicType.of(interfaceBuilder.getClassDescription()));
            }

            for (int genericIndex = 0; genericIndex <= argIndex; genericIndex++) {
                classBuilder.withClassGeneric("T" + genericIndex, null);
            }


            createConstructorsAcceptingTypeTokens(argIndex, classBuilder);

            classBuilder.withMethod(
                new Method()
                    .name("get" + argIndex)
                    .type(DynamicType.of(EventArgument.class).withAddedGeneric(DynamicType.of("T" + argIndex)))
                    .code(code -> {
                        code.appendAndNewLine("try {");
                        code.increaseDepth(1);
                        code.appendAndNewLine("return event.getArgument(t" + argIndex + ", " + argIndex + ");");
                        code.increaseDepth(-1);
                        code.appendAndNewLine("} catch (Throwable e) {");
                        code.increaseDepth(1);
                        code.appendAndNewLine("throw new IllegalStateException(\"An error occured while trying to get a variable of type \" + t" + argIndex + " + \" from \" + event.key(), e);");
                        code.increaseDepth(-1);
                        code.appendAndNewLine("}");
                    })
            );

/*            classBuilder.withMethod("public", "get" + argIndex, DynamicType.of(EventArgument.class).withAddedGeneric(DynamicType.of("T" + argIndex)), code -> {
                code.appendAndNewLine("try {");
                code.increaseDepth(1);
                code.appendAndNewLine("return event.getArgument(t" + argIndex + ", " + argIndex + ");");
                code.increaseDepth(-1);
                code.appendAndNewLine("} catch (Throwable e) {");
                code.increaseDepth(1);
                code.appendAndNewLine("throw new IllegalStateException(\"An error occured while trying to get a variable of type \" + t" + argIndex + " + \" from \" + event.key(), e);");
                code.increaseDepth(-1);
                code.appendAndNewLine("}");
            });*/


            ClassBuilder builder = builderClasses[argIndex];
            createDescriptionBuilder(argIndex, builder, descriptionClasses, builderClasses);

            classBuilder.writeClassFile(srcDir);
        }
    }

    private static void createDescriptionBuilder(int argIndex, ClassBuilder builder, ClassBuilder[] descriptionClasses, ClassBuilder[] builderClasses) {
        for (int genericIndex = 0; genericIndex <= argIndex; genericIndex++) {
            builder.withField("", DynamicType.of(TypeToken.class).withAddedGeneric(genericType(genericIndex)), "t" + genericIndex, (CodeExpression) null);
            builder.withClassGeneric("T" + genericIndex, null);
        }

        Parameter[] constructorParameters = new Parameter[argIndex + 1];
        for (int c = 0; c < constructorParameters.length; c++) {
            constructorParameters[c] = new Parameter(DynamicType.of(TypeToken.class).withAddedGeneric(genericType(c)), "t" + c);
        }

        builder.withConstructor(
            new Constructor()
                .parameter(constructorParameters)
                .code(code -> {
                    for (int arg = 0; arg < constructorParameters.length; arg++) {
                        code.appendAndNewLine("this." + "t" + arg + " = " + "t" + arg + ";");
                    }
                }));

        if (argIndex + 1 < builderClasses.length) {
            createBuilderConcatenationMethods(argIndex, builder, builderClasses);
        }

        DynamicType typeWithGenerics = createTypeWithGenerics(descriptionClasses[argIndex], argIndex, false);

        builder.withMethod(
            new Method()
                .name("build")
                .type(typeWithGenerics)
                .parameter(new Parameter(DynamicType.of(PlatformEventWrapper.class, false), "event"))
                .code(code -> {
                    CodeExpression[] types = new CodeExpression[argIndex + 1];
                    for (int i1 = 0; i1 < types.length; i1++) {
                        types[i1] = CodeExpression.create().with("t" + i1);
                    }

                    code.append("return ").append(new ConstructorCall(typeWithGenerics, types)).append(";");
                })
        );

/*        builder.withMethod("public", "build", typeWithGenerics, code -> {

            CodeExpression[] types = new CodeExpression[argIndex + 1];
            for (int i1 = 0; i1 < types.length; i1++) {
                types[i1] = CodeExpression.create().with("t" + i1);
            }

            code.append("return ").append(new ConstructorCall(typeWithGenerics, types)).append(";");
        }, new Parameter(DynamicType.of(PlatformEventWrapper.class, false), "event"));*/
    }

    private static DynamicType createTypeWithGenerics(ClassBuilder classBuilder, int argIndex, boolean includeNextType) {
        DynamicType type = DynamicType.of(classBuilder.getClassDescription());
        for (int arg = 0; arg <= argIndex; arg++) {
            type = type.withAddedGeneric(genericType(arg));
        }

        if (includeNextType) {
            type = type.withAddedGeneric(genericType(argIndex + 1));
        }
        return type;
    }

    private static void createBuilderConcatenationMethods(int argIndex, ClassBuilder builder, ClassBuilder[] builderClasses) {
        List<GenericDeclaration> generics = List.of(new GenericDeclaration("T" + (argIndex + 1), null));

        DynamicType typeWithGenerics = createTypeWithGenerics(builderClasses[argIndex + 1], argIndex, true);

        builder.withMethod(
            new Method()
                .name("with")
                .generic(generics)
                .type(typeWithGenerics)
                .parameter(new Parameter(DynamicType.of(TypeToken.class).withAddedGeneric(genericType(argIndex + 1)), "t" + (argIndex + 1)))
                .code(code -> {
                    CodeExpression[] types = new CodeExpression[argIndex + 2];
                    for (int i1 = 0; i1 < types.length; i1++) {
                        types[i1] = CodeExpression.create().with("t" + i1);
                    }

                    code.append("return ").append(new ConstructorCall(typeWithGenerics, types)).append(";");
                })
        );

        builder.withMethod(
            new Method()
                .name("with")
                .type(typeWithGenerics)
                .generic(generics)
                .parameter(new Parameter(DynamicType.of(Class.class).withAddedGeneric(genericType(argIndex + 1)), "t" + (argIndex + 1)))
                .code(code -> {
                    CodeExpression[] types = new CodeExpression[argIndex + 2];
                    for (int i1 = 0; i1 < types.length - 1; i1++) {
                        types[i1] = CodeExpression.create().with("t" + i1);
                    }
                    types[types.length - 1] = CodeExpression.create().with("TypeToken.of(" + "t" + (types.length - 1) + ")");

                    code.append("return ").append(new ConstructorCall(typeWithGenerics, types)).append(";");
                })
        );

/*        builder.withMethod("public", generics, "with", typeWithGenerics, code -> {

            CodeExpression[] types = new CodeExpression[argIndex + 2];
            for (int i1 = 0; i1 < types.length; i1++) {
                types[i1] = CodeExpression.create().with("t" + i1);
            }

            code.append("return ").append(new ConstructorCall(typeWithGenerics, types)).append(";");
        }, new Parameter(DynamicType.of(TypeToken.class).withAddedGeneric(genericType(argIndex + 1)), "t" + (argIndex + 1)));*/

/*        builder.withMethod("public", generics, "with", typeWithGenerics, code -> {

            CodeExpression[] types = new CodeExpression[argIndex + 2];
            for (int i1 = 0; i1 < types.length - 1; i1++) {
                types[i1] = CodeExpression.create().with("t" + i1);
            }
            types[types.length - 1] = CodeExpression.create().with("TypeToken.of(" + "t" + (types.length - 1) + ")");

            code.append("return ").append(new ConstructorCall(typeWithGenerics, types)).append(";");
        }, new Parameter(DynamicType.of(Class.class).withAddedGeneric(genericType(argIndex + 1)), "t" + (argIndex + 1)));*/
    }

    private static void createConstructorsAcceptingTypeTokens(int argIndex, ClassBuilder classBuilder) {
        Parameter[] constructorParameters = new Parameter[argIndex + 1];
        for (int c = 0; c < constructorParameters.length; c++) {
            constructorParameters[c] = new Parameter(DynamicType.of(TypeToken.class).withAddedGeneric(genericType(c)), "t" + c);
        }


        classBuilder.withConstructor(
            new Constructor()
                .parameter(constructorParameters)
                .code(code -> {
                    if (argIndex > 0) {
                        code.append("super(");
                    }

                    for (int arg = 0; arg < constructorParameters.length; arg++) {
                        Parameter parameter = constructorParameters[arg];
                        if (constructorParameters.length > 1) {
                            if (arg <= constructorParameters.length - 2) {
                                code.append(parameter.name());
                            }

                            if (arg < constructorParameters.length - 2) {
                                code.append(", ");
                            }

                            if (arg == constructorParameters.length - 2) {
                                code.appendAndNewLine(");");
                            }
                        }
                        if (arg == constructorParameters.length - 1) {
                            code.append("this." + "t" + arg + " = " + "t" + arg + ";");
                        }
                    }
                }));
    }

    private static @NotNull DynamicType genericType(int argIndex) {
        return DynamicType.of("T" + argIndex);
    }

    private static @NotNull DynamicType genericParameter(int argIndex) {
        return DynamicType.of("t" + argIndex);
    }
}
