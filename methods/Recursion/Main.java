package methods.Recursion;

import methods.NumberBased.*;
import methods.NumberBased.SumOfDigits;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        printMenu();

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            default:
                System.out.println("Invalid Choice.");
                break;
            case 1:
                System.out.println("Enter the number.");
                int sum = sc.nextInt();
                System.out.println(SumN.sumN(sum));
                break;

            case 2:
                System.out.println("Enter the number.");
                int sumD = sc.nextInt();
                System.out.println(methods.Recursion.SumOfDigits.sumDigits(sumD));
                break;

            case 3:
                System.out.println("Enter the numbers separated by space.");
                int a1 = sc.nextInt();  int a2 = sc.nextInt();
                System.out.println("GCD of "+a1+" "+a2+" is "+GCD.gcd(a1, a2));
                break;

            case 4:
                System.out.println("Enter the Number.");
                int fibo = sc.nextInt();
               System.out.println("Fibonacci upto " +fibo+" is "+Fibonacci.fibonacci(fibo));
                break;

            case 5:
                System.out.println("Enter the Number and power it be raised separated by space.");
                int n = sc.nextInt();   int p = sc.nextInt();
                System.out.println(n+" raised to power of " + p + " is "+PowerRecursion.powerRecursion(n, p));
                break;

            case 6:
                System.out.println("Enter the String.");
                StringBuilder sb = new StringBuilder(sc.nextLine());
                System.out.println("Reversed String "+ StringReverse.reverseString(sb, 0, sb.length() - 1));
                break;
        }
        sc.close();
    }

    private static void printMenu() {
        String[] options = {
                "1: Sum of 1 to nth Numbers",
                "2: Sum of Digits in a Number",
                "3: Greatest Common Divisor of two numbers",
                "4: Fibonacci sum upto nth number",
                "5: Number n Raised to power p",
                "6: Reverse String"
        };
        System.out.println("\n===== Recursion Theory & DSA Menu =====");
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("\nEnter your choice: ");
    }
}
