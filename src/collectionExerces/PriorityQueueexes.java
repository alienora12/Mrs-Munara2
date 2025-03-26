
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueexes {

    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Blue");
        queue1.add("White");
        queue1.add("Black");

        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("Red");
        queue2.add("Green");
        queue2.add("Blue");
        queue2.add("White");

        PriorityQueue<String> queue3 = new PriorityQueue<>();
        queue3.add("Red");
        queue3.add("Green");
        queue3.add("Blue");
        queue3.add("White");
        queue3.add("Black");

        // Exercise 6: Count the number of elements in a priority queue
        System.out.println("Exercise 6: Count elements in a priority queue");
        System.out.println("Original Priority Queue: " + queue1);
        System.out.println("Number of elements in queue1: " + queue1.size());
        System.out.println();

        // Exercise 7: Compare two priority queues
        System.out.println("Exercise 7: Compare two priority queues");
        System.out.println("queue1: " + queue1);
        System.out.println("queue2: " + queue2);
        System.out.println("queue1 equals queue2: " + queue1.equals(queue2));
        System.out.println("queue1 equals queue3: " + queue1.equals(queue3));
        System.out.println();

        // Exercise 8: Retrieve the first element of the priority queue
        System.out.println("Exercise 8: Retrieve the first element");
        System.out.println("Priority Queue: " + queue1);
        System.out.println("First element of queue1: " + queue1.peek());
        System.out.println();

        // Exercise 9: Retrieve and remove the first element
        System.out.println("Exercise 9: Retrieve and remove the first element");
        System.out.println("Priority Queue before removal: " + queue1);
        System.out.println("Element removed: " + queue1.poll());
        System.out.println("Priority Queue after removal: " + queue1);
        System.out.println();

        // Exercise 10: Convert a priority queue to an array
        System.out.println("Exercise 10: Convert priority queue to array");
        System.out.println("Priority Queue: " + queue1);
        Object[] array = queue1.toArray();
        System.out.println("Array representation: " + Arrays.toString(array));
        System.out.println();

        // Exercise 11: Convert priority queue elements to string representation
        System.out.println("Exercise 11: Convert priority queue elements to string");
        System.out.println("Default string representation: " + queue1.toString());

        StringBuilder sb = new StringBuilder();
        sb.append("Custom representation: [");
        for (String element : queue1) {
            sb.append(element).append(", ");
        }
        if (!queue1.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
