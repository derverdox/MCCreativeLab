package de.verdox.mccreativelab.classgenerator.util;
public class FieldNameUtil{

    public static String capitalize(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static String convert_FieldsToCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }


        if (!s.contains("_")) {
            return s.toLowerCase();
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : s.toCharArray()) {
            if (c == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }

        return result.toString();
    }

}
