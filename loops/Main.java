import java.util.*;

public class Main {
  public static void main() {
    Multiplication_table table = new Multiplication_table();
    table.start();

    Prime_Checker isPrime = new Prime_Checker();
    isPrime.start();

    patterns pattern = new patterns();
    pattern.pat1();
  }
}
