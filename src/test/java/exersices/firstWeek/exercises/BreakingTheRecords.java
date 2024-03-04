package exersices.firstWeek.exercises;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

    public List<Integer> calculateRecords (List<Integer> inputArray){
        List<Integer> results = new ArrayList<>();
        int highestScore = inputArray.get(0);
        int lowestScore = inputArray.get(0);

        int maxScore = 0;
        int minScore = 0;

        for (int i = 0; i < inputArray.size(); i++){
            int currentScore = inputArray.get(i);

            if (currentScore > highestScore){
                highestScore = currentScore;
                maxScore ++;
            } if (currentScore < lowestScore){
                lowestScore = currentScore;
                minScore ++;
            }
        }
        results.add(maxScore);
        results.add(minScore);

        return results;
    }
}
