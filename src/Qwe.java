
import java.util.*;

public class Qwe {

    public static <T> List<T> mergeAlternately(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            result.add(list1.get(i++));
            result.add(list2.get(j++));
        }

        while (i < list1.size()) {
            result.add(list1.get(i++));
        }


        
        while (j < list2.size()) {
            result.add(list2.get(j++));
        }

        return result;
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5");

        List<String> mergedList = mergeAlternately(list1, list2);
        System.out.println("Merged List: " + mergedList);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        printMap(map);

        TaskScheduler scheduler = new TaskScheduler();

        Task task1 = new Task("Code Review", 3, 20);
        Task task2 = new Task("System Update", 5, 45);
        Task task3 = new Task("Database Backup", 2, 30);
        Task task4 = new Task("Deploy New Feature", 5, 50);
        Task task5 = new Task("Bug Fixing", 4, 25);

        scheduler.addTask(task1);
        scheduler.addTask(task2);
        scheduler.addTask(task3);
        scheduler.addTask(task4);
        scheduler.addTask(task5);

        System.out.println("Tasks Added:");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
        System.out.println(task5);

        scheduler.displayScheduledTasks();

        scheduler.processHighestPriorityTask();
        scheduler.moveTaskToPending("Code Review");

        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.moveTaskToPending("Database Backup");

        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processHighestPriorityTask();

        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processHighestPriorityTask();

        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processHighestPriorityTask();

        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        scheduler.processHighestPriorityTask();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();
    }
}

class Task implements Comparable<Task> {

    private String taskName;
    private int priority;
    private int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public int compareTo(Task other) {
        if (other.priority != this.priority) {
            return other.priority - this.priority;
        }
        return this.duration - other.duration;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}

class TaskScheduler {

    private PriorityQueue<Task> tasks;
    private Queue<Task> pendingTasks;

    public TaskScheduler() {
        this.tasks = new PriorityQueue<>();
        this.pendingTasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task processHighestPriorityTask() {
        if (tasks.isEmpty()) {
            if (pendingTasks.isEmpty()) {
                return null;
            }
            Task nextPending = pendingTasks.poll();
            System.out.println("Processing Task: " + nextPending);
            return nextPending;
        }

        Task highestPriority = tasks.poll();
        System.out.println("Processing Task: " + highestPriority);
        return highestPriority;
    }

    public void moveTaskToPending(String taskName) {
        Task taskToMove = null;

        for (Task task : tasks) {
            if (task.getTaskName().equals(taskName)) {
                taskToMove = task;
                break;
            }
        }

        if (taskToMove != null) {
            tasks.remove(taskToMove);
            pendingTasks.add(taskToMove);
            System.out.println("Delaying Task: " + taskToMove.getTaskName());
        }
    }

    public void displayScheduledTasks() {
        System.out.println("\nScheduled Tasks (sorted by priority): ");
        if (tasks.isEmpty()) {
            System.out.println("(No priority tasks) ");
            return;
        }

        PriorityQueue<Task> tempQueue = new PriorityQueue<>(tasks);
        int count = 1;

        while (!tempQueue.isEmpty()) {
            System.out.println(count++ + ". " + tempQueue.poll());
        }
    }

    public void displayPendingTasks() {
        System.out.println("Pending Tasks (FIFO Order): ");
        if (pendingTasks.isEmpty()) {
            System.out.println("(No pending tasks) ");
            return;
        }

        Queue<Task> tempQueue = new LinkedList<>(pendingTasks);
        int count = 1;

        for (Task task : pendingTasks) {
            System.out.println(count++ + ". " + task.getTaskName() + " (Priority: "
                    + task.getPriority() + ", Duration: " + task.getDuration() + " mins)");
        }
    }
}
