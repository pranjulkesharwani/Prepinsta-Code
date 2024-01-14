import java.util.Scanner;

public class Armstrong {

    public static int order(int n) {
        int len = 0;

        while (n != 0) {
            len++;
            n /= 10;
        }
        return len;
    }

    public static boolean armStrong(int number, int len) {
        // boolean flag = false;

        int remainder = 0;
        int result = 0, temp;
        temp = number;
        while (temp != 0) {
            remainder = temp % 10;
            result += Math.pow(remainder, len);
            temp /= 10;

        }

        return (result == number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        int number = sc.nextInt();
        int n = order(number);

        if (armStrong(number, n)) {
            System.out.printf(" %d is Amrstrong Number", number);
        } else {
            System.out.printf(" %d Not an ArmStrong Number", number);
        }
    }

}