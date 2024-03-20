package exersices.firstWeek.exercises;

public class PlusMinus {
    public static void main(String[] args) {
        int arr[] = {4, -2, 3, 7, 0, -9};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0)
                positiveCount++;

            else if(arr[i] < 0)
                negativeCount++;

            else
                zeroCount++;
        }
        System.out.println("Count of positive numbers in array: "+positiveCount);
        System.out.println("Count of negative numbers in array: "+negativeCount);
        System.out.println("Count of zeroes in array: "+zeroCount);
    }
}
