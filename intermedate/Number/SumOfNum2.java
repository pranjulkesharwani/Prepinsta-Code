import java.util.Scanner;

public class SumOfNum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        sum = b * (b + 1) / 2 - a * (a + 1) / 2 + a;
        System.out.println(sum);

    }
}
