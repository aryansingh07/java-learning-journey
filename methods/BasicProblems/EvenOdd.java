package methods.BasicProblems;

public class EvenOdd {
    static boolean evenOrOdd(int a) {
        if ( a < 0) throw new IllegalArgumentException("Write positive number.");
        if (a % 2 == 0) return true;
        return false;
    }
}
