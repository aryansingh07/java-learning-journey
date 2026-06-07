package arrays.fundamentals;

public class CountFrequencyOfElement {
    public static int countFrequency(int[] arr, int x) {
        if(arr == null || arr.length == 0) throw new IllegalArgumentException("Please provide values for operating.");

        if(arr.length == 1 )    return arr[0];

        int count = 0;

        for (int j : arr)   if (j == x) count++;

        return count;
    }
}
