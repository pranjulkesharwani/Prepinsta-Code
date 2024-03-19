import java.util.*;

public class UnionTwoArrayNaive {
    void getUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            for (int j = i + 1; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                result.add(arr1[i]);
            }
        }

        for (int i = 0; i < m; i++) {
            boolean flag = false;

            for (int j = i + 1; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = true;
                    break;
                }
            }
        }
    }
}
