public class PrimeFactor {

    public static void main(String[] args) {
        int num = 1716;
        System.out.println("Prime factor of" + num + "are :");
        primeFactor(num);
    }

    public static void primeFactor(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                System.out.println("" + i);
                num /= i;
            }
        }
        if (num > 2) {
            System.out.println(num);
        }
    }
}
