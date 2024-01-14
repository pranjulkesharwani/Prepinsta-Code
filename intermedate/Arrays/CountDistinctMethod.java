import java.util.Arrays;

public class CountDistinctMethod {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10, 30, 40 };

        int len = arr.length;

        System.out.print(countDistinct(arr, len));
    }

    private static int countDistinct(int[] arr, int len) {

        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < len; i++) {

            while (i < len - 1 && arr[i] == arr[i + 1])
                i++;

            count++;
        }
        return count;
    }

}
