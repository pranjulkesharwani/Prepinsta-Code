import java.util.Arrays;

public class CountDistinctSort3 {
    public static void main(String[] args) {
        int arr[] = { 20, 38, 50, 83, 70, 20 };

        int len = arr.length;

        System.out.print("Count of Distinct: " + countDistinct(arr, len));
    }

    public static int countDistinct(int[] arr, int len) {

        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
