package utils;

import java.security.InvalidParameterException;

public class CombineUtils {

    public static void combineString(String category, String value) {
        switch (category) {
            case "M":
                System.out.println(combineMethod(value));
                break;
            case "C":
                System.out.println(combineClass(value));
                break;
            case "V":
                System.out.println(combineVariable(value));
                break;
            default:
                throw new InvalidParameterException("Invalid category: " + category);
        }
    }

    public static String combineMethod(String value) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (i == 0) {
                output.append(Character.toLowerCase(c));
            } else if (Character.isWhitespace(c)) {
                output.append(Character.toUpperCase(value.charAt(i + 1)));
                i++;
            } else {
                output.append(c);
            }
        }
        return output.append("()").toString();
    }

    public static String combineClass(String value) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (i == 0) {
                output.append(Character.toUpperCase(c));
            } else if (Character.isWhitespace(c)) {
                output.append(Character.toUpperCase(value.charAt(i + 1)));
                i++;
            } else {
                output.append(c);
            }
        }

        return output.toString();
    }

    public static String combineVariable(String value) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            if (i == 0) {
                output.append(Character.toLowerCase(c));
            } else if (Character.isWhitespace(c)) {
                output.append(Character.toUpperCase(value.charAt(i + 1)));
                i++;
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }
}