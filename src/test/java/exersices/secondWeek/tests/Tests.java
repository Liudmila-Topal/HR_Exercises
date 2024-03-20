package exersices.secondWeek.tests;

import exersices.secondWeek.exercises.LonelyInteger;
import exersices.secondWeek.exercises.StudentsGrade;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {

    @Test
    public void lonelyInteger(){
        Integer[] a = {1, 2, 3, 4, 3, 2, 1};
        List<Integer> input = Arrays.asList(a);
        LonelyInteger def = new LonelyInteger();

        int uniqueElement = def.findUniqueElement(input);
        System.out.println(uniqueElement);
    }

    @Test
    public void studentsGrade(){
        Integer[] a = {1, 25, 33, 43, 37, 25, 100, 76};
        List<Integer> grades = Arrays.asList(a);
        StudentsGrade calculateGrade = new StudentsGrade();

        List<Integer> roundedGrade = calculateGrade.roundGrade(grades);
        System.out.println(roundedGrade);
    }
}
