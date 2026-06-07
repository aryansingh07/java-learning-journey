package arrays.fundamentals;

public class CheckSortedArray {
    public static boolean isArraySorted(int[] arr) {
        if (arr.length == 0)    throw new IllegalArgumentException("Please provide values to operate.");

        int count = 0;

        for (int i = 1; i < arr.length; i++ ) {
            if (arr[i] >= arr[i-1])  count++;
        }
        return arr.length == count+1;
    }
}