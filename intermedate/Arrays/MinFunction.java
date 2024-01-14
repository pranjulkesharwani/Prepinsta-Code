import java.util.Arrays;

class MinFunction {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 40, 50, 30 };

        System.out.print(getMin(arr));
    }

    private static int getMin(int[] arr) {

        Arrays.sort(arr);

        int min = arr[0];
        return min;
    }
}