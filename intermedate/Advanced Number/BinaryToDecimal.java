import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bin = sc.nextLong();

        getBinaryToDecimal(bin);

    }

    public static int getBinaryToDecimal(long bin) {
        int result = 0;
        int digit = 1;
        int i = 0;
        while (bin != 0) {

            digit = (int) bin % 10;
            result += digit * Math.pow(2, i);
            bin /= 10;
            i++;
        }
        System.out.println(result);
        return result;
    }
}
