package numbers;
public class prime_checker {
    static boolean isPrime(int num) {
        Boolean isPrime;
        if (num <= 0)   isPrime = false;
        else {
            for (int i = 2; i <= num-1; i++) {
                if(num % i == 0)    isPrime = false;
            }
        }
        return true;
    }
}
