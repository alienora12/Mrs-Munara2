
import java.util.*;

public class TreeMapExerc {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(30, "Black");
        treeMap.put(40, "White");
        treeMap.put(50, "Blue");

        System.out.println("Original TreeMap: " + treeMap);

        // Exercise 13
        System.out.println("\n--- Exercise 13 ---");
        getKeysStrictlyLessThan(treeMap, 30);

        // Exercise 14
        System.out.println("\n--- Exercise 14 ---");
        getKeysLessThanOrEqual(treeMap, 30, true);
        getKeysLessThanOrEqual(treeMap, 30, false);

        // Exercise 15
        System.out.println("\n--- Exercise 15 ---");
        getLeastKeyStrictlyGreater(treeMap, 30);
        getLeastKeyStrictlyGreater(treeMap, 60);

        // Exercise 16
        System.out.println("\n--- Exercise 16 ---");
        getEntryWithGreatestKeyStrictlyLess(treeMap, 30);
        getEntryWithGreatestKeyStrictlyLess(treeMap, 10);

        // Exercise 17
        System.out.println("\n--- Exercise 17 ---");
        getGreatestKeyStrictlyLess(treeMap, 30);
        getGreatestKeyStrictlyLess(treeMap, 10);

        // Exercise 18
        System.out.println("\n--- Exercise 18 ---");
        getNavigableKeySet(treeMap);
    }

    // Exercise 13: Get portion of map whose keys are strictly less than a given key
    public static void getKeysStrictlyLessThan(TreeMap<Integer, String> map, Integer key) {
        SortedMap<Integer, String> result = map.headMap(key);
        System.out.println("Keys strictly less than " + key + ": " + result);
    }

    // Exercise 14: Get portion of map whose keys are less than or equal to a given key
    public static void getKeysLessThanOrEqual(TreeMap<Integer, String> map, Integer key, boolean inclusive) {
        SortedMap<Integer, String> result = map.headMap(key, inclusive);
        System.out.println("Keys less than " + (inclusive ? "or equal to " : "") + key + ": " + result);
    }

    // Exercise 15: Get least key strictly greater than given key
    public static void getLeastKeyStrictlyGreater(TreeMap<Integer, String> map, Integer key) {
        Integer result = map.higherKey(key);
        System.out.println("Least key strictly greater than " + key + ": " + result);
    }

    // Exercise 16: Get key-value mapping with greatest key strictly less than given key
    public static void getEntryWithGreatestKeyStrictlyLess(TreeMap<Integer, String> map, Integer key) {
        Map.Entry<Integer, String> result = map.lowerEntry(key);
        System.out.println("Entry with greatest key strictly less than " + key + ": " + result);
    }

    // Exercise 17: Get greatest key strictly less than given key
    public static void getGreatestKeyStrictlyLess(TreeMap<Integer, String> map, Integer key) {
        Integer result = map.lowerKey(key);
        System.out.println("Greatest key strictly less than " + key + ": " + result);
    }

    // Exercise 18: Get NavigableSet view of keys in map
    public static void getNavigableKeySet(TreeMap<Integer, String> map) {
        NavigableSet<Integer> navSet = map.navigableKeySet();
        System.out.println("NavigableSet view of keys: " + navSet);
        System.out.println("Descending Set view of keys: " + navSet.descendingSet());
    }
}
