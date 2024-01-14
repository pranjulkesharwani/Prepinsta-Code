import java.util.Scanner;

public class GreatestOfThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int maxOfTwo = first > second ? first : second;

        int result = maxOfTwo > third ? maxOfTwo : third;

        System.out.println(result);
    }
}
