import java.util.*;

public class CountDistinct2 {
    int countDistinct(int[] arr, int n) {

        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
            count++;
        }

        return count;
    }
}
