import java.util.*;

public class PairSumHashing {
    int pairSum(int arr[], int n, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(sum - arr[i])) {
                System.out.println(arr[i] + "," + (sum - arr[i]));
            }
        }

        return 0;
    }
}
