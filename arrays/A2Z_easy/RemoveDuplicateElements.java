package arrays.A2Z_easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateElements {
    //given sorted array
    public static ArrayList<Integer> removeDuplicate(int[] arr) {
        if(arr.length == 0) throw new IllegalArgumentException("Please provide values for operating");

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        if(arr.length == 1) return result;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1])   result.add(arr[i]);
        }
        return result;


    }
}
