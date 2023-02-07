package Homework_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {
        // 1. Создать словарь HashMap. Обобщение <Integer, String>.
        // 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        HashMap<Integer, String> mapColors = new HashMap<>();
        mapColors.put(1, "Красный");
        mapColors.put(2, "Желтый");
        mapColors.put(3, "Зеленый");
        System.out.println(mapColors);

        // 3. Изменить значения дописав восклицательные знаки.
        Set<Integer> ks = mapColors.keySet();
        for (Integer tmp : ks) {
            mapColors.compute(tmp, (k, v) -> v += "!");
        }
        System.out.println(mapColors);

        // 4. *Создать TreeMap, заполнить аналогично.
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Красный");
        tm.put(2, "Желтый");
        tm.put(3, "Зеленый");
        System.out.println(tm);

        Set<Integer> kstm = tm.keySet();
        for (Integer tmp : kstm) {
            tm.compute(tmp, (k, v) -> v += "!");
        }
        System.out.println(tm);

        // 5. *Увеличить количество элементов до 1000 случайными ключами и общей
        // строкой.
        HashMap<String, String> mapRnd = new HashMap<>();
        Random keyRnd = new Random();
        while (mapRnd.size() <= 10000) {
            mapRnd.put(Character.getName(keyRnd.nextInt(65000)), "0");
        }
        HashMap<Integer, String> mapSerial = new HashMap<>();
        for (int index = 0; index < 10000; index++) {
            mapSerial.put(index, "0");
        }

        // 6. **Сравнить время последовательного и случайного перебора тысячи элементов
        // словарей.
        Set<String> ksMapRnd = mapRnd.keySet();
        ArrayList<String> strList1 = new ArrayList<>();
        long start1 = System.currentTimeMillis();
        for (String tmp : ksMapRnd) {
            strList1.add(mapRnd.get(tmp));
        }
        long end1 = System.currentTimeMillis();

        Set<Integer> ksmapSerial = mapSerial.keySet();
        ArrayList<String> strList2 = new ArrayList<>();
        long start2 = System.currentTimeMillis();
        for (Integer tmp : ksmapSerial) {
            strList2.add(mapSerial.get(tmp));
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Время перебора случайных ключей: " + (end1 - start1));
        System.out.println("Время перебора последовательных ключей: " + (end2 - start2));
    }
}
