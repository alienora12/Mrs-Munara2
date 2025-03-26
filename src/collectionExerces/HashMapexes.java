
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapexes {

    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Red", 1);
        originalMap.put("Green", 2);
        originalMap.put("Blue", 3);
        originalMap.put("Yellow", 4);

        System.out.println("Original HashMap: " + originalMap);

        // 6. Get a shallow copy of a HashMap instance
        HashMap<String, Integer> shallowCopy = new HashMap<>(originalMap);
        System.out.println("\n6. Shallow copy of HashMap: " + shallowCopy);

        // 7. Test if a map contains a mapping for the specified key
        String keyToCheck = "Green";
        if (originalMap.containsKey(keyToCheck)) {
            System.out.println("\n7. Map contains the key '" + keyToCheck + "'");
        } else {
            System.out.println("\n7. Map does not contain the key '" + keyToCheck + "'");
        }

        // 8. Test if a map contains a mapping for the specified value
        Integer valueToCheck = 3;
        if (originalMap.containsValue(valueToCheck)) {
            System.out.println("\n8. Map contains the value " + valueToCheck);
        } else {
            System.out.println("\n8. Map does not contain the value " + valueToCheck);
        }

        // 9. Create a set view of the mappings contained in a map
        Set<Map.Entry<String, Integer>> entrySet = originalMap.entrySet();
        System.out.println("\n9. Set view of mappings:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("  Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Get the value of a specified key in a map
        String specificKey = "Blue";
        Integer value = originalMap.get(specificKey);
        System.out.println("\n10. Value for key '" + specificKey + "': " + value);

        // 11. Get a set view of the keys contained in this map
        Set<String> keySet = originalMap.keySet();
        System.out.println("\n11. Set view of keys: " + keySet);
    }
}
