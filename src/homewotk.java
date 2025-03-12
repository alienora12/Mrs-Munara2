import java.util.ArrayList;
import java.util.List;


class Utility {
    public static <T> void displayList(List<T> list) {
        System.out.println("Элементы списка:");
        for (T item : list) {
            System.out.println(item);
        }
    }
}

public class homewotk {
    public static void main(String[] args) {

        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(10);
        intStorage.add(20);
        intStorage.add(30);
        intStorage.display();
        System.out.println("Получен элемент: " + intStorage.get(1));
        intStorage.remove(1);
        intStorage.display();

        Storage<String> stringStorage = new Storage<>();
        stringStorage.add("Привет");
        stringStorage.add("Мир");
        stringStorage.display();


        Storage<Double> floatStorage = new Storage<>();
        floatStorage.add(3.14);
        floatStorage.add(2.71);
        floatStorage.display();

        List<String> sampleList = new ArrayList<>();
        sampleList.add("a");
        sampleList.add("b");
        sampleList.add("c");
        Utility.displayList(sampleList);
    }
}
