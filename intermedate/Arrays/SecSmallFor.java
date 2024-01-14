public class SecSmallFor {
    public static void main(String[] args) {

        int[] arr = { 10, -20, 30, -40 };

        System.out.print(getSecMin(arr));

    }

    private static int getSecMin(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min && arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        return secMin;
    }
}
