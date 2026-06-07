package arrays.fundamentals;

public class ReverseArray {
    public static int[] reversedArray(int[] arr, int left, int right) {
        if (arr.length == 0)    throw new IllegalArgumentException("Please provide value for operating.");

//        int left = 0;
//        int right = arr.length - 1;

        while ( left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}
