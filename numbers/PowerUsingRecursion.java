package numbers;

public class PowerUsingRecursion {
    static int powerRecursion (int n, int p) {
        if (p <= 1) return 1;

        return n * (powerRecursion(n, p-1));
    }
}
