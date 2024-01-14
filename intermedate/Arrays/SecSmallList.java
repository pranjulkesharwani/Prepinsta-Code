import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SecSmallList {
    public static void main(String[] args) {

        Integer arr[] = { 10, -5, 20, -2, 30, 50 };

        System.out.print(getSecMin(arr));
    }

    private static int getSecMin(Integer arr[]) {

        List<Integer> list = Arrays.asList(arr);

        Collections.sort(list);

        return list.get(1);
    }
}
