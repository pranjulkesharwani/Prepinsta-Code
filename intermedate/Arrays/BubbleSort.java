public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 10, 50, 30, 20, 40 };

        getSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void getSort(int[] arr) {

        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {

            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // return 0;
    }
}
