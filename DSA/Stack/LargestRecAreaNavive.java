import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LargestRecAreaNavive {
    static int maxArea(int[] arr, int n) {
        int res = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    count++;
                } else {
                    break;
                }
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    count++;
                } else {
                    break;
                }
            }

            int temp = count * arr[i];
            res = Math.max(res, temp);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 4, 1, 5, 7 };

        int n = 7;
        System.out.print("max Area " + maxArea(arr, n));
    }
}
