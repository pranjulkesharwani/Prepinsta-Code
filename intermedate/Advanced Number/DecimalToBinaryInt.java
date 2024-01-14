public class DecimalToBinaryInt {
    public static void main(String[] args) {
        int decimal = 7;
        convert(decimal);
    }

    private static void convert(int num) {
        int i = 1;
        int dec, res = 0;
        while (num != 0) {
            dec = num % 2;
            res += dec * i;
            num /= 2;
            i *= 10;
        }

        System.out.print(res);
    }
}
