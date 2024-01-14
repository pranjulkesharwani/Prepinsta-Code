import java.util.Scanner;

class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[2][];

        x[0] = new int[4];
        x[1] = new int[5];

        for (int[] oneDArr : x) {
            for (int next : oneDArr) {
                System.out.print(next + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println((i + 1) + "th Array:");
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("Enter a record: ");
                x[i][j] = sc.nextInt();
            }

            System.out.println();
        }

        for (int[] oneDArr : x) {
            for (int next : oneDArr) {
                System.out.print(next + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}