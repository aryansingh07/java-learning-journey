import java.util.Scanners;

public class Multiplication_table {
  Scanner sc = new Scanner(System.in);

  public void start() {
    System.out.print("Enter a number: ");

    int num = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(num+" * "+i+" = "+(num*i));
    }
  }
}
