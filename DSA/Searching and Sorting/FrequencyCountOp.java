import java.util.Arrays;

public class FrequencyCountOp {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 20, 10, 30, 40, 80 };

        frequencyCount(arr);
    }

    public static void frequencyCount(int[] arr) {

        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length) {
            int count = 1;

            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }

            System.out.println(arr[i] + " : " + count);
            i++;
        }
    }
}
