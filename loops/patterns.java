package loops;
import java.util.*;

public class patterns {
    Scanner sc = new Scanner(System.in);
    int n;

    // Constructor
    public patterns() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }

    //5*5 star
    public void pat1() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Half-triangle star
    public void pat2(){
        for (int i = 0; i<=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //half-triangle reverse star
    public void pat3() {
        for (int i = 0; i<n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //1->n index triangle print
    public void pat4() {
        for(int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    //1->n number triangle print
    public void pat5() {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    //n->1 number triangle print
    public void pat6() {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    //star pyramid
    public void pat7() {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //reverse star pyramid
    public void pat8() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //star rhombus
    public void pat9() {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //half star rhombus
    public void pat10() {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //bit triangle
    public void pat11() {
        for(int i = 0; i < n; i++) {
            int start = (i % 2 == 0) ? 1 : 0;   //for alternate start
            for(int j = 0; j <= i; j++) {
                System.out.print(start+" ");
                start = 1 - start;  //toggle between 1 & 0
            }
            System.out.println();
        }
        System.out.println();
    }

    //
}
