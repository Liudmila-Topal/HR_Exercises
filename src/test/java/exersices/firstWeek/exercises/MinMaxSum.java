package exersices.firstWeek.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {

    public List<Long> findMaxAndMinOfSum(List<Integer> inputArray) {
        List<Long> listOfSums = new ArrayList<Long>();
        List<Long> minMaxOfSums = new ArrayList<Long>();

        List<Long> longList = inputArray.stream()
                .map(Long::valueOf)
                .collect(Collectors.toList());
        longList.forEach(x -> {
            listOfSums.add(
                    longList.stream()
                            .mapToLong(Long::longValue)
                            .sum() - x);
        });

        Long min = Collections.min(listOfSums);
        Long max = Collections.max(listOfSums);

        minMaxOfSums.add(min);
        minMaxOfSums.add(max);
        return minMaxOfSums;
    }
}
