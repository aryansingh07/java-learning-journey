package methods.BasicProblems;

import java.util.Scanner;

public class TwoVariableCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printMenu();

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {
            case 1:
                System.out.println("Enter the two integers separated by space.");
                int a = sc.nextInt();   int b = sc.nextInt();
                System.out.println(Addition.add(a, b));
                break;
            case 2:
                System.out.println("Enter the two integers separated by space.");
                int a1 = sc.nextInt();   int b1 = sc.nextInt();
                System.out.println(Substraction.substract(a1, b1));
                break;
            case 3:
                System.out.println("Enter the two integers separated by space.");
                int a2 = sc.nextInt();   int b2 = sc.nextInt();
                System.out.println(Multiplication.multiply(a2, b2));
                break;
            case 4:
                System.out.println("Enter the two integers separated by space.");
                int a3 = sc.nextInt();   int b3 = sc.nextInt();
                System.out.println(Division.divide(a3, b3));
                break;
            case 5:
                System.out.println("Enter the integer.");
                int q = sc.nextInt();   boolean out = EvenOdd.evenOrOdd(q);
                if(out)    System.out.println("It is an even number.");
                else    System.out.println("It is an Odd Number.");
                break;
            case 6:
                System.out.println("Enter the three integers separated by space.");
                int a4 = sc.nextInt();   int b4 = sc.nextInt();   int c = sc.nextInt();
                System.out.println(Average.mean(a4, b4, c));
                break;
        }
    }
    private static void printMenu() {
        String[] options = {
                "1: Addition of two variables.",
                "2: Substraction of two variables.",
                "3: Multiplication of two variables.",
                "4: Division of two variables.",
                "5: Check if variable is even or odd.",
                "6: Mean of three variables."
        };
        System.out.print("===== mini calculator =====");
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Enter Your Choice: ");
    }
}
