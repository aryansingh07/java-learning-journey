package arrays.fundamentals;

public class SmallestElement {
    public static int smallestElement(int[] arr) {
        if (arr.length == 0)    throw new IllegalArgumentException("Please provide values to operate");

        int smallest = 0;

        for (int j : arr) {
            smallest = Math.min(smallest, j);
        }
        return smallest;
    }
}
