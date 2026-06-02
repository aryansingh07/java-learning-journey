import java.util.Scanner;

public class Prime_Checker {
  Scanner sc = new Scanner(System.in);
  
  public void start() {
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    Boolean isPrime = true;
    
    if (num <= 0) {
      System.out.print("Not a prime number.");
    }
    else {
      for (int i = 2; i <= num-1; i++) {
        if (num % i == 0)  isPrime = false;
      }
      if (isPrime == false)  System.out.print("Not a prime number.");
      else  System.out.print("It is a prime number.");
    }
  }
}
