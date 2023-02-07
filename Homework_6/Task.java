package Homework_6;

import java.util.*;

public class Task {

    public static void main(String[] args) {
        // Разработать программу, имитирующую поведение коллекции HashSet. В программе
        // содать метод add добавляющий элемент, метод toString возвращающий строку с
        // элементами множества и метод позволяющий читать элементы по индексу. Формат
        // данных Integer.
        MySet mySet = new MySet();
        mySet.add(123);
        mySet.add(456);
        mySet.add(321);
        System.out.println(mySet);
        System.out.println(mySet.size());
        System.out.println(mySet.get(1));

    }

}

class MySet {
    private HashMap<Integer, Object> map = new HashMap();
    private final Object OBJ = new Object();

    public boolean add(Integer input) {
        return map.putIfAbsent(input, OBJ) != null ? true : false;
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Integer size() {
        return map.size();
    }

    public Integer get(Integer idx) {
        Integer[] arrayStr = map.keySet().toArray(new Integer[0]);
        return arrayStr[idx];
    }
}