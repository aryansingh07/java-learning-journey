package arrays.fundamentals;

public class MoveZerosToEnd {
    public static int[] pushZerosToEnd(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr;
        int j = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
