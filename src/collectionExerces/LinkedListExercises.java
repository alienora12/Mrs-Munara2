
import java.util.LinkedList;

public class LinkedListExercises {

    // Exercise 17: Join two linked lists
    public static <T> LinkedList<T> joinLinkedLists(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> joinedList = new LinkedList<>(list1);
        joinedList.addAll(list2);
        return joinedList;
    }

    // Exercise 18: Copy a linked list to another linked list
    public static <T> LinkedList<T> copyLinkedList(LinkedList<T> originalList) {
        return new LinkedList<>(originalList);
    }

    // Exercise 19: Remove and return the first element of a linked list
    public static <T> T removeFirstElement(LinkedList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    // Exercise 20: Retrieve but not remove the first element of a linked list
    public static <T> T getFirstElement(LinkedList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    // Exercise 21: Retrieve but not remove the last element of a linked list
    public static <T> T getLastElement(LinkedList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.getLast();
    }

    // Exercise 22: Check if a particular element exists in a linked list
    public static <T> boolean elementExists(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Yellow");
        list2.add("Orange");
        list2.add("Purple");

        // Exercise 17: Join two linked lists
        System.out.println("Exercise 17: Join two linked lists");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        LinkedList<String> joinedList = joinLinkedLists(list1, list2);
        System.out.println("Joined List: " + joinedList);
        System.out.println();

        // Exercise 18: Copy a linked list to another linked list
        System.out.println("Exercise 18: Copy a linked list");
        LinkedList<String> copiedList = copyLinkedList(list1);
        System.out.println("Original List: " + list1);
        System.out.println("Copied List: " + copiedList);
        System.out.println();

        // Exercise 19: Remove and return the first element
        System.out.println("Exercise 19: Remove and return the first element");
        System.out.println("Original List: " + list1);
        String firstElement = removeFirstElement(list1);
        System.out.println("Removed Element: " + firstElement);
        System.out.println("List after removal: " + list1);
        System.out.println();

        // Exercise 20: Retrieve but not remove the first element
        System.out.println("Exercise 20: Retrieve but not remove the first element");
        System.out.println("List: " + list1);
        String first = getFirstElement(list1);
        System.out.println("First Element: " + first);
        System.out.println("List after retrieval: " + list1);
        System.out.println();

        // Exercise 21: Retrieve but not remove the last element
        System.out.println("Exercise 21: Retrieve but not remove the last element");
        System.out.println("List: " + list1);
        String last = getLastElement(list1);
        System.out.println("Last Element: " + last);
        System.out.println("List after retrieval: " + list1);
        System.out.println();

        // Exercise 22: Check if element exists
        System.out.println("Exercise 22: Check if element exists");
        System.out.println("List: " + list1);
        System.out.println("Does 'Green' exist? " + elementExists(list1, "Green"));
        System.out.println("Does 'Red' exist? " + elementExists(list1, "Red"));
    }
}
