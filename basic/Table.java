import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        table(num);
    }

    public static void table(int x) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + "*" + i + "=" + i * x);
        }
    }
}
