import java.util.List;
import java.util.Arrays;
// import java.util.Scanner;
import java.util.Collections;

public class MinList {
    public static int getMin(Integer[] arr) {

        List<Integer> list = Arrays.asList(arr);

        Collections.sort(list);

        return list.get(0);
    }

    public static void main(String[] args) {
        Integer[] arr = { 10, 50, 20, 30, 40 };

        System.out.print(getMin(arr));
    }

}
