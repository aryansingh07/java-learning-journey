package numbers;

import java.util.ArrayList;

public class All_Divisors {
    static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int sqrt = (int)Math.sqrt(n);
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0)  result.add(i);
        }
        return result;
    }
}
