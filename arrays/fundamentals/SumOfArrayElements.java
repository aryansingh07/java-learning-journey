package arrays.fundamentals;

import java.util.List;

public class SumOfArrayElements {
    public static int arraySum(int[] arr) {
        if (arr == null || arr,length == 0)    throw new IllegalArgumentException("Please provide values for operating.");

        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
