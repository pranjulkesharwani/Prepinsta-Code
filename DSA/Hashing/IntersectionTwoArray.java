import java.util.ArrayList;

public class IntersectionTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 5, 8, 5, 7, 8, 10 };
        int[] arr2 = { 1, 5, 5, 8, 1, 8, 7 };

        ArrayList<Integer> result = new ArrayList<>();

        int size1 = arr1.length;
        int size2 = arr2.length;

        System.out.println(getIntersection(arr1, arr2, size1, size2));
    }

    static int getIntersection(int[] arr1, int[] arr2, int size1, int size2) {
        int count = 0;

        for (int i = 0; i < size1; i++) {
            int flag = 0;

            for (int j = i + 1; j < size1; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                continue;
            }
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
