public class HCF {
    public static void main(String[] args) {
        int n1 = 144, n2 = 32;
        int hcf = 1;

        for (int i = 1; (i < n1 || i < n2); i++) {
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }

        System.out.print("HCF is " + hcf);
    }
}
