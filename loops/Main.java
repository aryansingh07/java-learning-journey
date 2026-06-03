package loops;
import numbers.prime_checker;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Multiplication Table");
        System.out.println("2: Patterns");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                multiplication_table table = new multiplication_table();
                table.start();
                break;

            case 2:
                Scanner sx = new Scanner(System.in);
                System.out.println("Enter the pattern you want to see (1 to 11)");
                int pat = sx.nextInt();
                patterns pattern = new patterns();
                switch (pat) {
                    case 1:
                        pattern.pat1();
                        break;
                    case 2:
                        pattern.pat2();
                        break;
                    case 3:
                        pattern.pat3();
                        break;
                    case 4:
                        pattern.pat4();
                        break;
                    case 5:
                        pattern.pat5();
                        break;
                    case 6:
                        pattern.pat6();
                        break;
                    case 7:
                        pattern.pat7();
                        break;
                    case 8:
                        pattern.pat8();
                        break;
                    case 9:
                        pattern.pat9();
                        break;
                    case 10:
                        pattern.pat10();
                        break;
                    case 11:
                        pattern.pat11();
                        break;
                }
        }
    }
}