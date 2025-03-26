
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {

    // Exercise 9: Copy one array list into another
    public static void copyArrayList() {
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Red");
        sourceList.add("Green");
        sourceList.add("Blue");

        ArrayList<String> destList = new ArrayList<>();
        destList.add("");
        destList.add("");
        destList.add("");

        System.out.println("Source list: " + sourceList);
        System.out.println("Destination list before: " + destList);

        Collections.copy(destList, sourceList);

        System.out.println("Destination list after: " + destList);

        ArrayList<String> newList = new ArrayList<>(sourceList);
        System.out.println("New list copied using constructor: " + newList);
    }

    // Exercise 10: Shuffle elements in an array list
    public static void shuffleArrayList() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("List before shuffling: " + colors);

        Collections.shuffle(colors);

        System.out.println("List after shuffling: " + colors);
    }

    // Exercise 11: Reverse elements in an array list
    public static void reverseArrayList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");

        System.out.println("List before reversing: " + fruits);

        Collections.reverse(fruits);

        System.out.println("List after reversing: " + fruits);
    }

    // Exercise 12: Extract a portion of an array list
    public static void extractArrayList() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");

        System.out.println("Original list: " + numbers);

        List<String> subList = numbers.subList(1, 4);

        System.out.println("Extracted portion: " + subList);
    }

    // Exercise 13: Compare two array lists
    public static void compareArrayLists() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Grape");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        ArrayList<String> commonElements = new ArrayList<>();
        for (String item : list1) {
            if (list2.contains(item)) {
                commonElements.add(item);
            }
        }

        System.out.println("Common elements: " + commonElements);
        System.out.println("Are lists equal? " + list1.equals(list2));
    }

    // Exercise 14: Swap two elements in an array list
    public static void swapArrayListElements() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Berlin");

        System.out.println("List before swapping: " + cities);
        Collections.swap(cities, 1, 3);

        System.out.println("List after swapping positions 1 and 3: " + cities);
    }

    public static void main(String[] args) {
        System.out.println("===== Exercise 9: Copy ArrayList =====");
        copyArrayList();
        System.out.println();

        System.out.println("===== Exercise 10: Shuffle ArrayList =====");
        shuffleArrayList();
        System.out.println();

        System.out.println("===== Exercise 11: Reverse ArrayList =====");
        reverseArrayList();
        System.out.println();

        System.out.println("===== Exercise 12: Extract ArrayList Portion =====");
        extractArrayList();
        System.out.println();

        System.out.println("===== Exercise 13: Compare ArrayLists =====");
        compareArrayLists();
        System.out.println();

        System.out.println("===== Exercise 14: Swap ArrayList Elements =====");
        swapArrayListElements();
    }
}
