public class PrintFrequencey {

    public static void main(String[] args) {
        int[] arr = { 10, 30, 10, 40, 30, 20 };

        frequency(arr);
    }

    public static void frequency(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean flag = false;

            for (int j = i + 1; j < arr.length; j++) {
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
                    count++;
                }
                System.out.println(arr[i] + ": " + count);
            }
        }
    }

}
