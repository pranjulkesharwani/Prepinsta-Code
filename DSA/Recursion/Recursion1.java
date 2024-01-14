public class Recursion1 {
    public static void main(String[] args) {
        int input = 3;
        generateAndPrintSequence(input);

    }

    public static void generateAndPrintSequence(int input) {
        generateSequence(input, input);
        System.out.println();
    }

    public static void generateSequence(int n, int current) {
        if (current <= 0)
            return;

        System.out.print(current + " ");
        generateSequence(n, current - 1);

        if (current < n) {
            System.out.print(current + " ");
        }
    }
}