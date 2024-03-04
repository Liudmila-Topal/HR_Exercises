package exersices.firstWeek.exercises;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public List<Integer> sparseArrays(List<String> strings, List<String> queries) {
        List<Integer> results = new ArrayList<>();

        for (String query : queries) {
            int sum = 0;
            for (String string : strings) {
                if (query.equals(string)) {
                    sum++;
                }
            }
            results.add(sum);
        }
        return results;
    }
}
