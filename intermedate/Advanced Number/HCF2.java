public class HCF2 {
    public static void main(String[] args) {
        int n1 = 144, n2 = 32;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }

        System.out.print("Highest Factor : " + n1);
    }
}
