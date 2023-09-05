package lesson_1.task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            myList.add(i);
        }

        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
