package numbers;

import java.util.*;

public class Unique_PrimeFactors {
    static ArrayList<Integer> primeFactor(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        if(n <= 1){
            result.add(-1);
            return result;
        }

        for(int i = 2; i <= n; i++) {

            if ( n % i == 0) {
                result.add(i);

                while ( n % i == 0) n /= i;
            }
        }
        if (n > 1)  result.add(n);
        return result;
    }
}
