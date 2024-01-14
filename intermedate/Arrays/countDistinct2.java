public class countDistinct2 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 10 };

        int len = arr.length;

        System.out.print(countDistinct(arr, len));
    }

    private static int countDistinct(int[] arr, int len) {
        int count = 0;

        for (int i = 0; i < len; i++) {
            int flag = 0;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                count++;
            }
        }
        return count;
    }
}
