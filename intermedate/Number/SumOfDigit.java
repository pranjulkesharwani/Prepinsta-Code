public class SumOfDigit {
    public static void main(String[] args) {
        int sum = 0;
        int num = 444;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
