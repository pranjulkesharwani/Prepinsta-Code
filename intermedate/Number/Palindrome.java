import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");

        int num = sc.nextInt();
        int reverse = 0;
        int temp;

        temp = num;

        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }

        if (num == reverse) {
            System.out.printf(" %d is Palindrome", num);
        } else {
            System.out.printf("%d is not a Palindrome", num);
        }

    }
}
