import java.util.HashMap;
import java.util.Map;

class PrepInsta2 {
    public static void main(String[] args) {
        HashMap<Integer, String> myhashmap = new HashMap<>();

        myhashmap.put(1, "Chennai");
        myhashmap.put(2, "Trichy");
        myhashmap.put(3, "Kanpur");
        myhashmap.put(4, "Coimbatore");
        myhashmap.put(5, "Bhopal");

        System.out.println(myhashmap);
        System.out.println(myhashmap.size());

        for (Map.Entry<Integer, String> x : myhashmap.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }

        if (myhashmap.containsKey(1)) {
            System.out.println("Contains 1: " + myhashmap.get(1));
        } else {
            System.out.println("Doesnt contains 1 key");
        }
        myhashmap.remove(1);
        System.out.println(myhashmap);
        System.out.println(myhashmap.size());

        if (myhashmap.containsValue("Bhopal")) {
            System.out.println("Contains Bhopal");
        } else {
            System.out.println("Does not contain Bhopal");
        }

        for (Integer i : myhashmap.keySet()) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (String i : myhashmap.values()) {
            System.out.println(i + " ");
        }
        System.out.println();

        for (Integer i : myhashmap.keySet()) {
            System.out.println("key: " + i + " value " + myhashmap);

        }
        myhashmap.clear();
        System.out.println(myhashmap.isEmpty());
    }
}