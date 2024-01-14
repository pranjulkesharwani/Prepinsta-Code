import java.util.Scanner;

public class LCMWhile {
    public static void main(String[] args) {

        // int n1, n2;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        getLCM(num1, num2);
    }

    public static int getLCM(int num1, int num2) {
        // int lcm = 1;
        int max = num1 > num2 ? num1 : num2;

        int temp = max;
        int lcm = 1;
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max = max + temp;
        }

        System.out.println(lcm + ": is ");

        return lcm;
    }

}
