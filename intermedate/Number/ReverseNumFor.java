import java.util.Scanner;

public class ReverseNumFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
