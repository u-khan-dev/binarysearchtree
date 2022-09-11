import java.util.TreeMap;
import java.util.Random;

public class BinarySearchTree {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();

        tMap.put(1, "Krang");
        tMap.put(10, "Kodos");
        tMap.put(20, "Marvin");
        tMap.put(2, "Blonx");
        tMap.put(8, "Jirmos");
        tMap.put(37, "Dranz");
        tMap.put(5, "Stink");
        tMap.put(26, "Blanco");
        tMap.put(11, "Ghrol");

        System.out.println(tMap.entrySet());
        System.out.println(tMap);
        System.out.println(tMap.get(11));
        System.out.println("Tree contains key 10: " + tMap.containsKey(10));
        System.out.println("Tree contains key 12: " + tMap.containsKey(12));
        System.out.println("Tree contains value \"Fred\": " + tMap.containsValue("Fred"));
        System.out.println("Tree contains value \"Blonx\": " + tMap.containsValue("Blonx"));
        System.out.println("Number of nodes in tree: " + tMap.size());

        TreeMap<Integer, String> tMap2 = new TreeMap<>();

        final int upperBound = 20000;
        Random rand = new Random();

        for (int i = 0; i < upperBound; i++) {
            int temp = rand.nextInt(upperBound + 1);

            if (!tMap2.containsKey(temp))
                tMap2.put(temp, "dummy");
        }

        System.out.println("Size of tree2: " + tMap2.size());
        System.out.println("Tree contains key 10: " + tMap2.containsKey(10));
        System.out.println("Tree contains key 5: " + tMap2.containsKey(5));
        System.out.println("Tree contains key 19654: " + tMap2.containsKey(19654));
        System.out.println("Tree contains key 1: " + tMap2.containsKey(1));
        System.out.println("Tree contains key 754: " + tMap2.containsKey(754));
        System.out.println("Tree contains key 29: " + tMap2.containsKey(29));

    }
}
