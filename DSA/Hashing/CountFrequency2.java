import java.util.*;

public class CountFrequency2 {
    static void countDistinct(int[] arr, int n) {
        Arrays.sort(arr);

        int i = 0;
        while (i < n) {
            int count = 1;

            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i += 1;
                count += 1;
            }
            System.out.println(arr[i] + " : " + count);
            i += 1;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 8, 5, 7, 8, 10 };
        int n = arr.length;

        countDistinct(arr, n);
    }
}
