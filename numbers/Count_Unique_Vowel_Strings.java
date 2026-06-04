package numbers;

public class Count_Unique_Vowel_Strings {
    static long vowelCount(String s) {
        int[] freq = new int[5];    //because 5 vowels
        long choices = 1;    //frequency of each vowel(s) multiplied together
        int distinct = 0;   //vowel(s) present in the string


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case 'a':
                    freq[0]++;
                    break;
                case 'e':
                    freq[1]++;
                    break;
                case 'i':
                    freq[2]++;
                    break;
                case 'o':
                    freq[3]++;
                    break;
                case 'u':
                    freq[4]++;
                    break;
            }
        }
        for (int num : freq) {
            if (num > 0)    choices *= num;
        }
        for (int element : freq) {
            if (element > 0)    distinct++;
        }
        long result = Count_Unique_Vowel_Strings.permutation(distinct);

        if (distinct == 0)  return 0;

        return result * choices ;
    }

    static long permutation(int n) {
        if (n <= 1) return 1;
        return n * permutation(n - 1);
    }
}
