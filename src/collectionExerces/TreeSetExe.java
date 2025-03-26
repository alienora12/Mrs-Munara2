
import java.util.TreeSet;

public class TreeSetExe {

    public static void main(String[] args) {
        // Create and populate a TreeSet with sample data
        TreeSet<Integer> numbers = createTreeSet();
        System.out.println("Original TreeSet: " + numbers);

        // // Exercise 9
        // findNumbersLessThanSeven(numbers);
        // // Exercise 10
        // getElementGreaterOrEqual(numbers, 6);
        // // Exercise 11
        // getElementLessOrEqual(numbers, 10);
        // // Exercise 12
        // getElementStrictlyGreater(numbers, 8);
        // // Exercise 13
        // getElementLowerThan(numbers, 8);
        // // Exercise 14
        // retrieveAndRemoveFirst(numbers);
    }

    private static TreeSet<Integer> createTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(11);
        set.add(13);
        return set;
    }

    // 9. Find numbers less than 7 in a tree set
    private static void findNumbersLessThanSeven(TreeSet<Integer> treeSet) {
        System.out.println("\n9. Numbers less than 7 in the TreeSet:");
        System.out.println(treeSet.headSet(7));
    }

    // 10. Get element greater than or equal to given element
    private static void getElementGreaterOrEqual(TreeSet<Integer> treeSet, int element) {
        System.out.println("\n10. Element greater than or equal to " + element + ":");
        System.out.println(treeSet.ceiling(element));
    }

    // 11. Get element less than or equal to given element
    private static void getElementLessOrEqual(TreeSet<Integer> treeSet, int element) {
        System.out.println("\n11. Element less than or equal to " + element + ":");
        System.out.println(treeSet.floor(element));
    }

    // 12. Get element strictly greater than given element
    private static void getElementStrictlyGreater(TreeSet<Integer> treeSet, int element) {
        System.out.println("\n12. Element strictly greater than " + element + ":");
        System.out.println(treeSet.higher(element));
    }

    // 13. Get element with a lower value than given element
    private static void getElementLowerThan(TreeSet<Integer> treeSet, int element) {
        System.out.println("\n13. Element with a lower value than " + element + ":");
        System.out.println(treeSet.lower(element));
    }

    // 14. Retrieve and remove the first element
    private static void retrieveAndRemoveFirst(TreeSet<Integer> treeSet) {
        System.out.println("\n14. TreeSet before removal: " + treeSet);
        Integer firstElement = treeSet.pollFirst();
        System.out.println("First element (removed): " + firstElement);
        System.out.println("TreeSet after removal: " + treeSet);
    }
}
