package arrays.fundamentals;

public class EvenAndOddElementsInArray {
    public static int[] countOddEvenElements(int[] arr) {
        if (arr.length == 0)    throw new IllegalArgumentException("Please provide values for operating.");

        int even = 0;
        int odd = 0;
        int[] result = new int[2];

        for (int j : arr) {
            if (j % 2 == 0) even++;
            else    odd++;
        }
        result[0] = odd;
        result[1] = even;

        return result;
    }
}
