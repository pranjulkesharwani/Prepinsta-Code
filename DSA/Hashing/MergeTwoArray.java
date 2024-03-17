import java.util.*;

public class MergeTwoArray {
    static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2, int n, int m) {
        // int[] result = new int[40];
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else {
                result.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            result.add(arr1[i]);
            i++;
        }
        while (j < m) {
            result.add(arr2[j]);
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8, 10, 12 };
        int[] arr2 = { 3, 5, 7, 9, 11, 13 };

        int n = arr1.length;
        int m = arr2.length;

        System.out.print(mergeArrays(arr1, arr2, n, m));
    }
}
