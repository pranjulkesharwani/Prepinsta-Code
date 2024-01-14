public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 20, 60, 70, 10, 30 };

        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void SelectionSort(int arr[]) {

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int min_index = i;

            for (int j = i + 1; j < len; j++) {

                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
    }
}