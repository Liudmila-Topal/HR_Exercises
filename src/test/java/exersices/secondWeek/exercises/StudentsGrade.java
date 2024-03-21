package exersices.secondWeek.exercises;

import java.util.ArrayList;
import java.util.List;

public class StudentsGrade {

        private final int FAILING_GRADE = 38;

        private final int COMPARATOR = 3;

        private final int MULTIPLE = 5;
    public List<Integer> roundGrade(List<Integer> grades){
        List<Integer> results = new ArrayList<>();

        for (int grade : grades){
            int remainder = grade % MULTIPLE;
            int nextInt = grade + (5 - remainder);

            if (grade < FAILING_GRADE){
                results.add(grade);
            } else if ((nextInt - grade) <= COMPARATOR) {
                results.add(nextInt);
            }
        }

        return results;
    }
}
