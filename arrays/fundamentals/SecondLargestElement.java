package arrays.fundamentals;

public class SecondLargestElement {
    public static int secondLargestElement (int[] arr) {
        if (arr == null || arr.length == 0)    throw new IllegalArgumentException("Please provide values for operation.");

        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
