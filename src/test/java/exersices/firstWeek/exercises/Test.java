package exersices.firstWeek.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] a = {0, 1, 2, 4, 6, 5, 3};
        List<Integer> out = Arrays.asList(a);
        int sum = 0;

        int size = out.size();
//        Integer sum = out.stream()
//                .reduce(0, Integer::sum);
        for (int i = 0; i < out.size() ; i++) {
            sum += out.get(i);
        }
        System.out.println(sum);
        int i = sum / size;
        System.out.println(i);
    }
}
