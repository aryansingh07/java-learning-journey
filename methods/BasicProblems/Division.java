package methods.BasicProblems;

public class Division {
    static int divide (int a, int b) {
        if (b == 0)    throw new ArithmeticException("Can't divide zero.");
        return a / b;
    }
}
