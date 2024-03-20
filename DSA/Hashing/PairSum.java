import java.util.*;

public class PairSum {
    int pairSum(int[] arr, int sum) {
        // arr.sort();
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length;

        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                System.out.print(arr[left] + ":" + arr[right]);
            } else if (arr[left] + arr[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return 0;
    }
}
