public class LCM {
    public static void main(String[] args) {
        int n1 = 36, n2 = 60;

        int max = (n1 > n2) ? n1 : n2;
        int lcm = 1;
        for (int i = max; i < n1 * n2; i = i + max) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
        }

        System.out.print("LCM is : " + lcm);
    }
}
