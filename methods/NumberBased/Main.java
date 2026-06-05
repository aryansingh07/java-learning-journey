package methods.NumberBased;

import java.util.Scanner;
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
                int num = sc.nextInt();
                System.out.println(methods.NumberBased.CountDigits.countDigits(num));
                break;

            case 2:
                System.out.println("Enter the number.");
                int n = sc.nextInt();
                System.out.println(ReverseDigits.reverseDigits(n));
                break;

            case 3:
                System.out.println("Enter the number.");
                int m = sc.nextInt();
                if (PalindromeNumber.isPalindrome(m)) System.out.println(m + " is a Palindrome Number.");
                else System.out.println(m + " is not a Palindrome Number.");
                break;

            case 4:
                System.out.println("Enter the Number.");
                int a = sc.nextInt();
                if (methods.NumberBased.ArmstrongNumber.isArmstrong(a)) System.out.println(a + " is an Armstrong Number.");
                else System.out.println(a + " is not Armstrong Number.");
                break;

            case 5:
                System.out.println("Enter the Number.");
                int fact = sc.nextInt();
                System.out.println("Factorial of '" + fact + "', i.e., " + fact + "! is " + Factorial.factorial(fact));
                break;

            case 6:
                System.out.println("Enter the Number.");
                int sum = sc.nextInt();
                System.out.println("Sum of Digit from "+ sum +" is "+ SumOfDigits.sumDigits(sum));
                break;

            case 7:
                System.out.println("Enter the Number.");
                int product = sc.nextInt();
                System.out.println("Product of Digit from "+ product +" is "+ProductOfDigits.productDigits(product));
                break;

            case 8:
                System.out.println("Enter the Number.");
                int small = sc.nextInt();
                System.out.println("Smallest Digit from "+ small +" is "+SmallestDigit.smallestDigit(small));
                break;

            case 9:
                System.out.println("Enter the Number.");
                int large = sc.nextInt();
                System.out.println("largest Digit from "+ large +" is "+LargestDigit.largestDigit(large));
                break;

            case 10:
                System.out.println("Enter the Number.");
                int perfect = sc.nextInt();
                if (IsPerfectNumber.isPerfect(perfect))   System.out.println(perfect + " is a Perfect Number.");
                else System.out.println(perfect + " is not a Perfect Number.");
                break;

            case 11:
                System.out.println("Enter the Number.");
                int niven = sc.nextInt();
                if (IsHarshadNumber.isHarshad(niven))   System.out.println(niven + " is a Harshad Number.");
                else System.out.println(niven + " is not a Harshad Number.");
                break;
        }
        sc.close();
    }

    private static void printMenu() {
        String[] options = {
                "1: Count Digits in a Number",
                "2: Reverse Number",
                "3: Palindrome Number",
                "4: Armstrong Number",
                "5: Factorial of a Number",
                "6: Sum of Digits in a Number",
                "7: Product of Digits in a Number",
                "8: Smallest Digits in a Number",
                "9: Largest Digits in a Number",
                "10: Check Perfect Number",
                "11: Check Harshad Number"

        };
        System.out.println("\n===== Number Theory & DSA Menu =====");
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("\nEnter your choice: ");
    }
}
