package arrays.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class MinMaxElements {
    public static ArrayList<Integer> minMax(int[] arr) {
        if(arr.length == 0)   throw new IllegalArgumentException("Please provide values for operating.");

        int min = arr[0];
        int max = arr[0];

        if (arr.length == 1)    return new ArrayList<>(List.of(min, max));

        for (int i = 1; i < arr.length; i++ ) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return new ArrayList<>(List.of(min, max));
    }
}
