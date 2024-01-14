import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Number is a Prime Number");
        } else {
            System.out.println("Number is Not Prime");
        }
    }

}
