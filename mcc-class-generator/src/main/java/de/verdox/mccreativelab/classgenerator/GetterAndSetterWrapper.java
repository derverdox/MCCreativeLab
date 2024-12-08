package de.verdox.mccreativelab.classgenerator;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class GetterAndSetterWrapper extends AbstractClassGenerator{
    public GetterAndSetterWrapper(File srcDir, String prefix, String suffix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        super(srcDir, prefix, suffix, excludedTypes, excludedPackages);
    }

    public ClassBuilder generateWrapperFromServerSource(Class<?> classToWrap, String newClassName, String packageOfNewClass) throws IOException {
        String packageFolder = classToWrap.getPackageName().replace(".", "/");
        String fileName = classToWrap.getSimpleName();

        Path sourceFileOfEvent = Path.of("../../mccreativelab-server/src/main/java/" + packageOfNewClass + "/" + newClassName + ".java");
        if (!sourceFileOfEvent.toFile().exists()) {
            LOGGER.info("Could not find class file of " + classToWrap.getSimpleName());
            return null;
        } else {}

        CompilationUnit cu = StaticJavaParser.parse(sourceFileOfEvent.toFile());
        Map<String, MethodDeclaration> methodDeclarations = new HashMap<>();
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            methodDeclarations.put(method.getNameAsString(), method);
        });

        return null;
    }

    private static List<MethodDeclaration> findAttributeReturnMethods(CompilationUnit cu) {
        List<MethodDeclaration> methods = new ArrayList<>();
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            method.getBody().ifPresent(body -> {
                body.findAll(ReturnStmt.class).forEach(returnStmt -> {
                    Optional<Expression> expression = returnStmt.getExpression();
                    if (expression.isPresent()) {
                        Expression expr = expression.get();
                        if (expr.isNameExpr() || expr.isFieldAccessExpr() || expr.isCastExpr() || expr.isMethodCallExpr()) {
                            methods.add(method);
                        }
                    }
                });
            });
        });
        return methods;
    }

    private static List<MethodDeclaration> findSetters(CompilationUnit cu) {
        List<MethodDeclaration> methods = new ArrayList<>();
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            method.getBody().ifPresent(body -> {
                body.findAll(ExpressionStmt.class).forEach(exprStmt -> {
                    if (exprStmt.getExpression().isAssignExpr()) {
                        AssignExpr assignExpr = exprStmt.getExpression().asAssignExpr();
                        if (assignExpr.getTarget().isFieldAccessExpr() || assignExpr.getTarget().isNameExpr()) {
                            methods.add(method);
                        }
                    }
                });
            });
        });
        return methods;
    }

    private static List<MethodDeclaration> findPrefixMethods(CompilationUnit cu) {
        List<MethodDeclaration> methods = new ArrayList<>();
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            String name = method.getNameAsString();
            if ((name.startsWith("get") || name.startsWith("set") || name.startsWith("is"))
                && Character.isUpperCase(name.charAt(3))) {
                methods.add(method);
            }
        });
        return methods;
    }

    private static List<FieldDeclaration> findPublicFields(CompilationUnit cu) {
        List<FieldDeclaration> fields = new ArrayList<>();
        cu.findAll(FieldDeclaration.class).forEach(field -> {
            if (field.isPublic()) {
                fields.add(field);
            }
        });
        return fields;
    }

    private static List<MethodDeclaration> findNonOverrideMethods(CompilationUnit cu) {
        List<MethodDeclaration> methods = new ArrayList<>();
        cu.findAll(MethodDeclaration.class).forEach(method -> {
            if (!method.isAnnotationPresent("Override")) {
                methods.add(method);
            }
        });
        return methods;
    }

}
