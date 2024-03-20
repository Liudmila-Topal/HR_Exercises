package exersices.firstWeek.exercises;

import static utils.CombineUtils.*;
import static utils.SplitUtils.*;
import static enums.Operators.*;


public class CamelCase {

    public void splitOrCombine(String input) {
        final String[] split = input.split(";");
        String operator = split[0];
        String category = split[1];
        String value = split[2];

        if (operator.equals(SPLIT.getOperator())) {
            splitString(category, value);
        } else if (operator.equals(COMBINE.getOperator())) {
            combineString(category, value);
        }
    }
}