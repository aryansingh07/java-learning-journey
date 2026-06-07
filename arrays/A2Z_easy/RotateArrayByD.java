package arrays.A2Z_easy;

public class RotateArrayByD {
    public static int[] rotateByD(int[] arr, int d) {
        if( arr == null || arr.length == 0) throw new IllegalArgumentException();

        int n = arr.length;

        d = d % n;  // handle d > n

        arr = arrays.fundamentals.ReverseArray.reversedArray(arr, 0, n -1 );
        arr = arrays.fundamentals.ReverseArray.reversedArray(arr, 0, d -1 );
        arr = arrays.fundamentals.ReverseArray.reversedArray(arr, d, n -1 );

        return arr;
    }
}
