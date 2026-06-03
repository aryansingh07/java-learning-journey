package numbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1: Count Digits in a Number");
        System.out.println("2: Reverse Number");
        System.out.println("3: Palindrome Number");
        System.out.println("4: Armstrong Number");
        System.out.println("5: GCD of 2 numbers.");
        System.out.println("6: Check for Prime Number.");
        System.out.println("7: All Divisors of a Number.");
        System.out.println("8: Factorial of a Number.");
        System.out.println("9: Trailing zeros in a Factorial.");
        System.out.println("10: LCM of 2 Numbers.");
        System.out.println("11: Unique Prime Factors.");
        System.out.println("12: Power using Recursion.");
        System.out.println("13: Modular Inverse.");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the number.");
                int num = sc.nextInt();
                System.out.println(Count_Number.count(num));
                break;

            case 2:
                System.out.println("Enter the number.");
                int n = sc.nextInt();
                System.out.println(Reverse_Digits.reverse(n));
                break;

            case 3:
                System.out.println("Enter the number.");
                int m = sc.nextInt();
                if(Palindrome.palin(m)) System.out.println("It is a Palindrome Number.");
                else System.out.println("It is not a Palindrome Number.");
                break;

            case 4:
                System.out.println("Enter the Number.");
                int a = sc.nextInt();
                if(Armstrong.arm(a))    System.out.println("It is an Armstrong Number.");
                else System.out.println("It is not Armstrong Number.");
                break;

            case 5:
                System.out.println("Enter the two numbers separated by space.");
                int b1 = sc.nextInt();  int b2 = sc.nextInt();
                System.out.println("GCD of two numbers is "+GCD_LCM.hcf(b1, b2));
                break;

            case 6:
                System.out.println("Enter the number.");
                int p = sc.nextInt();
                if(prime_checker.isPrime(p))
                    System.out.println("It is a Prime Number");
                else    System.out.println("It is not a Prime Number.");
                break;

            case 7:
                System.out.println("Enter a Number:");
                int div = sc.nextInt();
                System.out.println("All divisors of '"+div+"' are "+All_Divisors.getDivisors(div));
                break;

            case 8:
                System.out.println("Enter the Number.");
                int fact = sc.nextInt();
                System.out.println("Factorial of '"+fact+"', i.e., "+fact+"! is "+Factorial.factorial(fact));
                break;

            case 9:
                System.out.println("Enter the Number.");
                int factNum = sc.nextInt();
                System.out.println("No. of trailing zeros in Factorial of '"+factNum+"', i.e., "+factNum+"! is "+TrailingZeros.zeroFactorial(factNum));
                break;

            case 10:
                System.out.println("Enter the two numbers separated by space.");
                int a1 = sc.nextInt();  int a2 = sc.nextInt();
                System.out.println("LCM of two numbers is "+GCD_LCM.lcm(a1, a2));
                break;

            case 11:
                System.out.println("Enter the Number.");
                int c1 = sc.nextInt();
                System.out.println("Unique Prime Factors are " + Unique_PrimeFactors.primeFactor(c1));
                break;

            case 12:
                System.out.println("Enter the number & its raised power separated by space.");
                int d1 = sc.nextInt();  int d2 = sc.nextInt();
                System.out.println(d1 + " raised to the power " + d2 + " is " + PowerUsingRecursion.powerRecursion(d1, d2));
                break;

            case 13:
                System.out.println("Enter the number & modular separated by space.");
                int n1 = sc.nextInt();  int m1 = sc.nextInt();
                System.out.println("Modular Inverse: " + Modular_Inverse.modInverse(n1,m1));
                break;
        }
        sc.close();
    }
}
