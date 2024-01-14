import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first > second && first > third) {
            System.out.println(first + " is greatest");
        } else if (second > first && second > third)
            System.out.println(second + " is greatest");
        else {
            System.out.println(third + " third is greatest");
        }

        sc.close();
    }
}
