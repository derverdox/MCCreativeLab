package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.javadoc.JavadocBlockTag;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

import java.util.LinkedList;
import java.util.List;

public class JavaDocExpression implements CodeExpression {

    private final List<String> lines = new LinkedList<>();
    private final List<String> paramLines = new LinkedList<>();
    private String returnLine = "";

    public JavaDocExpression withText(String line) {
        lines.add(line);
        return this;
    }

    public JavaDocExpression withParamDefinition(String paramName, String definition) {
        paramLines.add("@param " + paramName + " " + definition);
        return this;
    }

    public JavaDocExpression withReturnDefinition(String paramName, String definition) {
        returnLine = "@return " + paramName + " " + definition;
        return this;
    }

    /**
     * @param comment
     * @return
     */
    public static JavaDocExpression fromComment(Comment comment) {
        JavaDocExpression javaDocExpression = new JavaDocExpression();

        for (String commentLine : comment.getContent().split("\n")) {
            if (commentLine.equals("/**") || commentLine.equals("*/") || commentLine.equals("*  ")) {
                continue;
            }
            javaDocExpression.withText(commentLine.replace("* ", "").replace("\n", ""));
        }

/*        if (comment.isJavadocComment()) {
            System.out.println("Found JavaDoc Comment: "+comment.asJavadocComment().parse().toText());

            comment.asJavadocComment().parse().getDescription()

            for (JavadocBlockTag blockTag : comment.asJavadocComment().parse().getBlockTags()) {
                System.out.println(blockTag.getContent().toText());
                javaDocExpression.withText(blockTag.getContent().toText());
            }
        }
        else {
            System.out.println(comment.getContent());
            javaDocExpression.withText(comment.getContent());
        }*/
        return javaDocExpression;
    }

    @Override
    public void write(CodeLineBuilder code) {
        if(lines.isEmpty() && paramLines.isEmpty() && returnLine.isEmpty()){
            return;
        }
        code.appendAndNewLine("/**");
        if(!lines.isEmpty()){
            for (String line : lines) {
                if(line.isEmpty() || line.isBlank()){
                    continue;
                }
                code.append(" * ").appendAndNewLine(line);
            }
        }
        if(!paramLines.isEmpty()){
            code.appendAndNewLine("*");
            for (String line : paramLines) {
                code.append(" * ").appendAndNewLine(line);
            }
        }
        if (!returnLine.isEmpty()) {
            code.append(" * ").appendAndNewLine(returnLine);
        }
        code.appendAndNewLine(" */");
    }

    @Override
    public String toString() {
        return "JavaDocExpression{" +
            "lines=" + lines +
            ", paramLines=" + paramLines +
            ", returnLine='" + returnLine + '\'' +
            '}';
    }
}
