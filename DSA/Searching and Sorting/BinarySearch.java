public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 50, 40, 10, 90, 80 };

        int len = arr.length;

        int item = 10;

        System.out.print(binarySearch(arr, item));
    }

    public static int binarySearch(int arr[], int item) {

        int len = arr.length;
        int l = 0;
        int r = len - 1;

        int mid = (l + r) / 2;

        while (l <= r) {
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}
