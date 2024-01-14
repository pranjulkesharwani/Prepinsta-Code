public class LCM2 {
    public static void main(String[] args) {
        int n1 = 36, n2 = 60;
        int hcf = 1;

        for (int i = 1; i < n1 || i < n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }

        int lcm = (n1 * n2) / hcf;

        System.out.print("LCM : " + lcm);
    }
}
