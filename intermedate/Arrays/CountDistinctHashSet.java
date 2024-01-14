import java.util.HashSet;

public class CountDistinctHashSet {
    public static void main(String[] args) {
        int arr[] = { 10, 40, 20, 10, 50, 60 };

        int len = arr.length;

        System.out.print("Unique Number are :" + countDistinct(arr, len));
    }

    public static int countDistinct(int arr[], int len) {

        HashSet unique = new HashSet<>();

        for (int i = 0; i < len; i++) {
            unique.add(arr[i]);
        }

        return unique.size();
    }
}
