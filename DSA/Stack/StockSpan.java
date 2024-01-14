import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = { 12, 14, 15, 7, 15, 17, 5 };

        int size = arr.length;
        stockSpan(arr, size);
    }

    static void stockSpan(int[] a, int s) {
        for (int i = 0; i < s; i++) {
            int c = 1;
            for (int j = i - 1; j >= 0 && a[j] <= a[i]; j--) {
                c++;
                System.out.println(c + " ");
            }
        }
    }
}
