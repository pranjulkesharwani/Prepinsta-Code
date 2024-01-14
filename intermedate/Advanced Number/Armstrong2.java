import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int len = order(num);

        int temp = num;
        int sum = 0, digit;
        while (temp != 0) {
            digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
        }

        if (num == sum) {
            System.out.println("is armstrong : " + num);
        } else {
            System.out.println("not a armstrong : " + num);
        }
    }

    // int len =0;
    public static int order(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num /= 10;
        }
        return len;
    }

}
