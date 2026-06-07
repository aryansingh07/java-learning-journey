package arrays.fundamentals;

public class LargestElement {
    public static int largestElement(int[] arr) {
        if(arr.length == 0) throw new IllegalArgumentException("Please provide values for operation.");
        int largest = 0;

        for (int j : arr) {
            largest = Math.max( largest, j ) ;
        }
        return largest;
    }
}
