import java.util.Scanner;

public class HexaToDeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hexa = sc.nextLine();
        // sc.nextLine();
        convert(hexa);
    }

    private static void convert(String hexa) {
        int decimal = 0, pos = 0;
        int len = hexa.length();
        for (int i = len - 1; i >= 0; i--) {

            if (hexa.charAt(i) >= '0' && hexa.charAt(i) <= '9') {

                int digit = hexa.charAt(i) - 48;
                decimal += digit * Math.pow(16, pos);
                pos++;
            } else if (hexa.charAt(i) >= 'A' && hexa.charAt(i) <= 'F') {
                int digit = hexa.charAt(i) - 55;
                decimal += digit * Math.pow(16, pos);
                pos++;
            }

        }
        System.out.print(decimal);
    }
}
