
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetex {

    public static void main(String[] args) {
        // Call all methods to demonstrate each operation
        cloneHashSet();
        hashSetToArray();
        hashSetToTreeSet();
        findNumbersLessThanSeven();
        compareHashSets();
        retainCommonElements();
    }

    // Task 6: Clone a hash set to another hash set
    public static void cloneHashSet() {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);

        HashSet<String> clonedSet = (HashSet<String>) hashSet.clone();

        System.out.println("Cloned Hash Set: " + clonedSet);
        System.out.println();
    }

    // Task 7: Convert a hash set to an array
    public static void hashSetToArray() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("Array elements: ");
        for (String element : array) {
            System.out.println(element);
        }
        System.out.println();
    }

    // Task 8: Convert a hash set to a tree set
    public static void hashSetToTreeSet() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);

        TreeSet<String> treeSet = new TreeSet<String>(hashSet);

        System.out.println("TreeSet elements: " + treeSet);
        System.out.println();
    }

    // Task 9: Find numbers less than 7 in a tree set
    public static void findNumbersLessThanSeven() {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);
        System.out.println("TreeSet: " + treeSet);

        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) treeSet.headSet(7);

        System.out.println("Numbers less than 7: " + lessThanSeven);
        System.out.println();
    }

    // Task 10: Compare two hash sets
    public static void compareHashSets() {
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Blue");
        hashSet1.add("Yellow");
        System.out.println("First HashSet: " + hashSet1);

        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("Red");
        hashSet2.add("Green");
        hashSet2.add("Black");
        hashSet2.add("White");
        System.out.println("Second HashSet: " + hashSet2);
        for (String element : hashSet1) {
            System.out.println(hashSet2.contains(element) ? "Yes, " + element + " exists in both sets"
                    : "No, " + element + " doesn't exist in the second set");
        }
        System.out.println();
    }

    // Task 11: Compare two sets and retain elements that are the same
    public static void retainCommonElements() {
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Blue");
        hashSet1.add("Yellow");
        System.out.println("First HashSet: " + hashSet1);

        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("Red");
        hashSet2.add("Green");
        hashSet2.add("Black");
        hashSet2.add("White");
        System.out.println("Second HashSet: " + hashSet2);

        HashSet<String> commonElements = new HashSet<String>(hashSet1);
        commonElements.retainAll(hashSet2);

        System.out.println("Common elements in both sets: " + commonElements);
    }
}
