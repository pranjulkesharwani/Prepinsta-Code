public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 3, 3, 3, 5, 5, 7 };
        int n = arr.length;

        System.out.print(removeDuplicate(arr, n));
    }

    static int removeDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1)
            return n;

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        arr[j] = arr[n - 1];
        j++;
        return j;
    }
}
