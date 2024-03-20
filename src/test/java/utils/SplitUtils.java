package utils;

import java.security.InvalidParameterException;

public class SplitUtils {

    public static void splitString(String category, String value) {
        switch (category) {
            case "M":
                System.out.println(splitMethod(value));
                break;
            case "C":
                System.out.println(splitClass(value));
                break;
            case "V":
                System.out.println(splitVariable(value));
                break;
            default:
                throw new InvalidParameterException("Invalid category: " + category);
        }
    }

    public static String splitMethod(String value) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (Character.isUpperCase(c)) {
                output.append(" ").append(Character.toLowerCase(c));
            } else if (c != '(' && c != ')') {
                output.append(c);
            }
        }
        return output.toString().trim();
    }

    public static String splitClass(String value) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (i == 0) {
                output.append(Character.toLowerCase(c));
            } else if (Character.isUpperCase(c)) {
                output.append(" ").append(Character.toLowerCase(c));
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }

    public static String splitVariable(String value) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (i == 0) {
                output.append(Character.toLowerCase(c));
            } else if (Character.isUpperCase(c)) {
                output.append(" ").append(Character.toLowerCase(c));
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }
}