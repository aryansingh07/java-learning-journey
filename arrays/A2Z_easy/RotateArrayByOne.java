package arrays.A2Z_easy;

public class RotateArrayByOne {
    public static int[] rotate(int[] arr) {
        if(arr.length == 0) throw new IllegalArgumentException();

        if(arr.length == 1) return arr;

        int last = arr[arr.length -1];

        for (int i = arr.length -1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        return arr;
    }
}
