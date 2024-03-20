package exersices.firstWeek.tests;

import exersices.firstWeek.exercises.*;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {

    private static final String TIME_EXAMPLES = "src/test/java/files/inputInfo/time.txt";

    private static final String CAMEL_CASE_EXAMPLES = "src/test/java/files/inputInfo/camelCase.txt";

    @Test
    public void minMaxOfSums() {
        Integer[] array = {396285104, 573261094, 759641832, 819230764, 364801279};
        List<Integer> inputNumbers = Arrays.asList(array);
        MinMaxSum obj = new MinMaxSum();

        List<Long> maxAndMinOfSum = obj.findMaxAndMinOfSum(inputNumbers);
        System.out.println(maxAndMinOfSum);
    }

    @Test
    public void timeConversion() throws IOException {
        TimeConversion conversion = new TimeConversion();
        List<String> readAllLines = Files.readAllLines(Paths.get(TIME_EXAMPLES));
        List<String> convertedTimes = new ArrayList<>();
        readAllLines
                .forEach(time -> {
                    String timeConverter = conversion.timeConverter(time);
                    convertedTimes.add(timeConverter);
                });
        System.out.println(convertedTimes);
    }

    @Test
    public void calculateRecords(){
        Integer[] score = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        List<Integer> inputScore = Arrays.asList(score);
        BreakingTheRecords breakingTheRecords = new BreakingTheRecords();

        List<Integer> calculatedRecords = breakingTheRecords.calculateRecords(inputScore);
        System.out.println(calculatedRecords);
    }

    @Test
    public void camelCase4() throws IOException {
        List<String> readAllLines = Files.readAllLines(Paths.get(CAMEL_CASE_EXAMPLES));
        CamelCase refactor = new CamelCase();

        readAllLines
                .forEach(refactor::splitOrCombine);
    }

    @Test
    public void divisibleSumPairs(){
        Integer[] ar = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        List<Integer> input = Arrays.asList(ar);
        int divisor = 3;
        int lenght = 6;
        DivisibleSumPairs div = new DivisibleSumPairs();
        int divSums = div.divSums(lenght, divisor, input);
        System.out.println(divSums);
    }

    @Test
    public void sparseArrays(){
        String[] str = {"aba", "baba", "aba", "xzxb"};
        List<String> strings = new ArrayList<>(List.of(str));

        String[] q = {"aba", "xzxb", "ab"};
        List<String> queries = new ArrayList<>(List.of(q));

        SparseArrays sparse = new SparseArrays();
        List<Integer> results = sparse.sparseArrays(strings, queries);
        System.out.println(results);
    }
}
