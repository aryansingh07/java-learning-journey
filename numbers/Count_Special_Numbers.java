package numbers;

public class Count_Special_Numbers {
    static int countSpecialNum(int arr[]) {

        int MAX = 1_000_000;

        int[] freq = new int[MAX + 1];
        boolean[] special = new boolean[MAX + 1];

        // Phase 1: Build frequency array
        for (int num : arr) {
            freq[num]++;
        }
        // Phase 2: Handle duplicates
        for (int x = 1; x <= MAX; x++) {

            if (freq[x] >= 2 ) {
                special[x] = true;
            }
        }
        //Phase 3: Sieve-style multiples processing
        for (int x = 1; x < MAX; x++) {
            if(freq[x] == 0) {
                continue;
            }
            for (int multiple = 2 * x ; multiple <= MAX; multiple += x) {
                if (freq[multiple] > 0) {
                    special[multiple] = true;
                }
            }
        }
        //Phase 4: Count special numbers in original array
        int count = 0;
        for (int num : arr) {
            if (special[num])   count++;
        }
        return count;
    }
}
