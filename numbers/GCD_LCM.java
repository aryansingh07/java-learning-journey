package numbers;

public class GCD_LCM {
    static int hcf(int a, int b) {
         while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    static int lcm(int a, int b) {
        int hcf = GCD_LCM.hcf(a,b);
        return Math.abs(( a / hcf ) * b );
    }
}
