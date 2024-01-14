import java.util.Scanner;

public class Greatest1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("number are equals");
        } else {
            String result = (num1 > num2) ? "num1 is greater" : "num2 is greater";
            System.out.println(result);
        }

    }
}