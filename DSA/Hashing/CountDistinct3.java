import java.util.*;

class CountDistinct3 {
    public static void main(String[] args) {
        int[] primitiveArray = { 5, 10, 5, 20, 15, 8, 8 };

        Integer[] objectArray = new Integer[primitiveArray.length];

        for (int ctr = 0; ctr < primitiveArray.length; ctr++) {
            objectArray[ctr] = primitiveArray[ctr];
        }
        System.out.println(countDistinct(objectArray));
    }

    static int countDistinct(Integer[] arr) {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));

        return set.size();
    }
}