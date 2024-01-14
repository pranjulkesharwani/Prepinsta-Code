import java.util.Scanner;

public class Greatest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Number in Equals");

        } else {
            System.out.println(Math.max(num1, num2));
        }
        sc.close();
    }
}
