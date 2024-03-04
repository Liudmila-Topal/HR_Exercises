package exersices.firstWeek.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    public int divSums(int lenght, int divisor, List<Integer> input) {
        int sum;
        int results = 0;

        for (int i = 0; i < lenght; i++){
            for (int j = i + 1; j < lenght; j++){
                sum = input.get(i) + input.get(j);
                if (sum % divisor == 0){
                results++;
                }
            }
        }
        return results;
    }
}
