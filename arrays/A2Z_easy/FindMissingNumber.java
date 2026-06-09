package arrays.A2Z_easy;

public class FindMissingNumber {
    public int missingNum(int arr[]) {
        int n = arr.length +1;

        long expected = (long) n * (n +1 ) / 2;
        long actual = 0;

        for (int i : arr) {
            actual += i;
        }
        return (int)(expected - actual);
    }
}
