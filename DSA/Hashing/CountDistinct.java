public class CountDistinct {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25, 30, 35 };

        int size = arr.length;
        System.out.println(countDistinct(arr, size));
    }

    static int countDistinct(int[] array, int size) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            int flag = 0;

            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
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
