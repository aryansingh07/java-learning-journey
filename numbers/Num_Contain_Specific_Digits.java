package numbers;

public class Num_Contain_Specific_Digits {
    static int countValid(int n, int[] arr) {

        int count = 0;

        int start = (int)Math.pow(10, n-1);
        int end = (int)Math.pow(10,n)-1;

        if(n == 1)  start = 0;

        for (int num = start; num < end; num++) {
            int temp = num;

            boolean valid = false;

            while (temp > 0) {
                int last = temp % 10;
                for (int x : arr) {
                    if(last == x) {
                        valid = true;
                        break;
                    }
                }
                if(valid)   break;
                temp /= 10;
            }
            if(valid)   count++;
        }
        return count;
    }
}
