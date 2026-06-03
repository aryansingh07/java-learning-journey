package numbers;

public class Modular_Inverse {
    static int modInverse (int a, int m) {
        for(int x = 1; x < m; x++) {
            if ((a * x) % m == 1)   return x;
        }
        return -1;
    }
}

//package numbers;
//
//class Result {
//    int gcd;
//    int x;
//    int y;
//
//    Result(int gcd, int x, int y) {
//        this.gcd = gcd;
//        this.x = x;
//        this.y = y;
//    }
//}
//
//public class Modular_Inverse {
//
//    static Result extendGCD(int a, int b) {
//        //base case
//        if (b == 0) return new Result(a, 1, 0);
//
//        //recursive call
//        Result next = extendGCD(b, a % b);
//
//        //back substitution
//        int x = next.y;
//        int y = next.x - (a / b) * next.y;
//
//        return new Result(next.gcd, x, y);
//    }
//    static int modInverse(int a, int b) {
//        Result ans = extendGCD(a, b);
//        if (ans.gcd != 1) {
//            return -1;
//        }
//        else {
//            int inverse = (ans.x % b + b) % b;
//            return inverse;
//        }
//    }
//}
