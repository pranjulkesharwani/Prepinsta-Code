public class DecimalToBinaryArray {
    public static void main(String[] args) {
        int decimal = 7;
        convert(decimal);
    }

    private static void convert(int num) {
        int binaryArr[] = new int[32];

        int binary, i = 0;
        while (num > 0) {
            binaryArr[i] = num % 2;

            num = num / 2;

            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryArr[j]);
        }

    }
}
