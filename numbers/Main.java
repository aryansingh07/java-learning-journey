package numbers;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        printMenu();

        int choice = sc.nextInt();
        sc.nextLine();

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

            case 14:
                System.out.println("Enter the Number.");
                int p1 = sc.nextInt();
                System.out.println("Primes are: " + Arrays.toString(Sieve_Eratosthenes.sieve(p1)) );
                break;

            case 15:
                System.out.println("Enter size of the array.");
                int size  = sc.nextInt();
                System.out.println("Enter " + size + " elements.");
                int[] arr = readDigitArray(sc, size);

                System.out.println("Enter the number.");
                int p2 = sc.nextInt();
                System.out.println("There are total of " + Num_Contain_Specific_Digits.countValid(p2, arr) + " "+ size+"-digit numbers which contain atleast one out of "+Arrays.toString(arr));
                break;

            case 16:
                System.out.println("Enter the String.");
                String st = sc.nextLine();
                System.out.println("Unique Vowel Strings: " + Count_Unique_Vowel_Strings.vowelCount(st) );
                break;

            case 17:
                System.out.println("Enter size of the array.");
                int size1  = sc.nextInt();
                System.out.println("Enter " + size1 + " elements.");
                int[] arr1 = readArray(sc, size1);

                System.out.println("Special Numbers: "+Count_Special_Numbers.countSpecialNum(arr1));
                break;
            default:
                System.out.println("Invalid Choice.");
        }
        sc.close();
    }
    private static int[] readDigitArray(Scanner sc, int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            while (true) {
                int input = sc.nextInt();
                // Check if the input is a single digit
                if (input >= 0 && input <= 9) {
                    arr[i] = input;
                    break; // Valid input, move to next array index
                }
                System.out.println("Please Enter a single digit (0-9).");
            }
        }
        return arr;
    }
    private static int[] readArray(Scanner sc, int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    private static void printMenu() {
        String[] options = {
                "1: Count Digits in a Number",
                "2: Reverse Number",
                "3: Palindrome Number",
                "4: Armstrong Number",
                "5: GCD of 2 Numbers",
                "6: Check for Prime Number",
                "7: All Divisors of a Number",
                "8: Factorial of a Number",
                "9: Trailing Zeros in a Factorial",
                "10: LCM of 2 Numbers",
                "11: Unique Prime Factors",
                "12: Power using Recursion",
                "13: Modular Inverse",
                "14: Sieve of Eratosthenes",
                "15: Count Numbers containing Specific Digits",
                "16: Count Unique Vowel Strings",
                "17: Count Special Numbers"
        };
        System.out.println("\n===== Number Theory & DSA Menu =====");
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("\nEnter your choice: ");
    }
}
