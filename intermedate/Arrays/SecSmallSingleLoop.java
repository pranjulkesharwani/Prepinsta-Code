public class SecSmallSingleLoop {
    public static void main(String[] args) {
        int[] arr = { 2, 30, -1, 0, -3 };

        System.out.print(getSmallest(arr));
    }

    private static int getSmallest(int[] arr) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] != first && arr[i] < second) {
                second = arr[i];
            }
        }
        return second;
    }
}
