package methods.NumberBased;

public class ProductOfDigits {
    static int productDigits(int num) {
        if (num == 0)   return 0;
        int product = 1;
        int sign= (num < 0) ? -1 : 1;

        while (num > 0) {
            int last = num % 10;
            if (last == 0)  return 0;
            product *= last;
            num /= 10;
        }
        return product;
    }
}
