package arrays.A2Z_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class FindUnion {
    public static ArrayList<Integer> findUnion (int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            result.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            result.add(b[i]);
        }
        Collections.sort(result);

        return result.stream().distinct().collect(Collectors.toCollection(ArrayList :: new));
    }
}
