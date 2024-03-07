public class DistinctCount {
    int DCount(int[] arr, int size) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            boolean flag = false;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
                if (flag == false) {
                    count++;
                }
            }

        }

        return count;
    }

}
