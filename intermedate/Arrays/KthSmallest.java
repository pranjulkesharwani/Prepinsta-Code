import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 44, 27, 30, 47, 35 };

        int len = arr.length;

        int result = -1;
        int count = 0;
        int k = 4;
        Arrays.sort(arr);

        for (int i = 0; i < len; i++) {

            while (i < len - 1 && arr[i] == arr[i + 1])
                i++;

            count++;

            // k--;
            if (k == count) {
                result = arr[i];
                break;
            }
        }

        System.out.print(result);
    }
}
