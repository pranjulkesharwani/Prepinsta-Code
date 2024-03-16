import java.util.*;

public class IntersectionTwoArrayHashing2 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 5, 8, 5, 7, 8, 10 };

        int[] arr2 = new int[] { 1, 5, 5, 8, 1, 8, 7 };

        int n = arr1.length;
        int m = arr2.length;

        System.out.println(getIntersection(arr1, arr2, n, m));

    }

    static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2, int n, int m) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            set2.add(arr2[i]);
        }

        // int i = 0;
        // int j = 0;
        // while (i < n && j < n) {
        // set1.add(arr1[i]);
        // set2.add(arr2[j]);
        // i++;
        // j++;
        // }
        // while (i < n) {
        // set1.add(arr1[i]);
        // i++;
        // }
        // while (j < m) {
        // set2.add(arr2[i]);
        // j++;
        // }

        for (int k = 0; k < m; k++) {
            if (set1.contains(arr2[k])) {
                result.add(arr2[k]);
                set1.remove(arr2[k]);
            }
        }
        return result;
    }
}
