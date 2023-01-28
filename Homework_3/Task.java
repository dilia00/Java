package Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        // 1. Создать новый список, добавить несколько строк и вывести коллекцию на
        // экран.
        System.out.println("\n1.");
        ArrayList<String> li = new ArrayList<>();
        li.add("Красный");
        li.add("Оранжевый");
        li.add("Желтый");
        li.add("Зеленый");
        li.add("Голубой");
        li.add("Синий");
        li.add("Фиолетовый");
        System.out.println(li);

        // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        System.out.println("\n2.");
        Iterator<String> it = li.iterator();
        while (it.hasNext()) {
            String str = it.next();
            str += "!";
            System.out.println(str);
        }

        // 3. Вставить элемент в список в первой позиции.
        System.out.println("\n3.");
        li.add(1, "Алый");
        System.out.println(li);

        // 4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("\n4.");
        System.out.println(li.get(5));

        // 5. Обновить определенный элемент списка по заданному индексу.
        System.out.println("\n5.");
        li.set(1, "Розовый");
        System.out.println(li);

        // 6. Удалить третий элемент из списка.
        System.out.println("\n6.");
        System.out.println(li.remove(2));
        System.out.println(li);

        // 7. Поиска элемента в списке по строке.
        System.out.println("\n7.");
        System.out.println(li.indexOf("Зеленый"));

        // 8. Создать новый список и добавить в него несколько елементов первого списка.
        System.out.println("\n8.");
        ArrayList<String> li2 = new ArrayList<>();
        li2.add("Белый");
        li2.add("Черный");
        li2.add("Серый");
        Collections.addAll(li2, "Голубой", "Синий", "Фиолетовый");
        System.out.println(li2);

        // 9. Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println("\n9.");
        li.retainAll(li2);
        System.out.println(li);

        // 10. Сортировка списка
        System.out.println("\n10.");
        ArrayList<Integer> intList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            intList.add(rnd.nextInt(10));

        }
        System.out.println(intList);
        intList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t0 - t1;
            }
        });
        System.out.println(intList);
    }
}
