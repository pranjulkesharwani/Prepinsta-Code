public class CountFrequency {
    void countFrequency(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            boolean flag = false;
            int count = 0;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                continue;
            }
            for (int j = 0; j <= i; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }
            System.out.print(arr[i] + " " + count);

        }
    }
}
