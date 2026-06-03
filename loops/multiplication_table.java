package loops;
import java.util.Scanner;
public class multiplication_table {
    Scanner sc = new Scanner(System.in);
    public void start() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
