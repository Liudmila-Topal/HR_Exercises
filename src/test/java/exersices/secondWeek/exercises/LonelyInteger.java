package exersices.secondWeek.exercises;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;

public class LonelyInteger {

    public int findUniqueElement(List<Integer> a) {
        return a.stream()
                .collect(groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() == 1)
                .findAny()
                .map(Map.Entry::getKey)
                .get();

    }
}
