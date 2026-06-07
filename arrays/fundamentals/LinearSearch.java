package arrays.fundamentals;

public class LinearSearch {
    public static int linearSearch(int[] arr, int x) {
        if (arr == null || arr.length == 0)    throw new IllegalArgumentException("Please provide values for operating.");

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == x)   return i;
        }
        return -1;
    }
}
