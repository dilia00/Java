package Seminar_3;

import java.util.*;

public class S3 {
    public static void main(String[] args) {
        int a = 0;
        ArrayList<String> list = new ArrayList<>();
        list.add("HelloWorld!");
        list.add("Hello!");
        list.add("World!");
        list.add("HW!");
        list.add(list.size() / 2, "World of Java!");
        list.set(2, "Java!");
        a = list.size();
        list.remove(a - 1);
        // System.out.println(list.remove("Java!"));

        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
        }

        for (String str : list) {
            // System.out.println(str);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            // System.out.println(str);
            // iterator.remove();
        }

        ListIterator<String> listIterator = list.listIterator(list.size() / 2);
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            // System.out.println(str);
            // listIterator.remove();
        }

        // list.forEach( (k) -> System.out.println(k) );

        System.out.println(list);

        System.out.println(list.indexOf("Java!"));
        list.lastIndexOf("Java!");

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            l1.add(rnd.nextInt(8));
            l2.add(rnd.nextInt(8));
        }

        System.out.println(l1);
        l1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return (t1 % 3 == 0 && t0 % 3 == 0) ? 0 : (t1 % 3 != 0 && t0 % 3 == 0) ? 1 : -1;
            }
        });

        // Collections.sort(l1);
        System.out.println(l1);

        // l1.removeAll(l2);
        // l1.retainAll(l2);
        // System.out.println(l1);

        String[] sArray = new String[list.size()];
        list.toArray(sArray);

        ArrayList<String> strList1 = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        strList1.add("Море");
        strList1.add("Вода");
        strList1.add("Солнце");
        strList1.add("Дерево");
        strList1.add("Консервы");
        strList1.add("Кожевенный");
        strList1.add("Облако");
        strList1.add("Гора");

        for (int i = 0; i < strList1.size(); i++) {
            intList.add(rnd.nextInt(8));
        }

        System.out.println(strList1);
        System.out.println(intList);

        for (int i = 0; i < strList1.size(); i++) {
            if (intList.get(i) < strList1.get(i).length()) {
                System.out.printf("%s > %d, ", strList1.get(i), intList.get(i));
                strList1.remove(i);
            }
        }
        System.out.println();

        System.out.println(strList1);

        ArrayList<String> li = new ArrayList<>();
        li.add("Hello_all!");
        li.add("Hello!");
        li.add("Java");
        li.add("Random!");
        li.add("1111!");
        ArrayList<Integer> randlist = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < li.size(); i++) {
            randlist.add(rand.nextInt(10));

        }
        System.out.println(li);
        System.out.println(randlist);
        ArrayList<String> tmp = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            if (randlist.get(i) > li.get(i).length()) {
                tmp.add(li.get(i));
            }
        }
        System.out.println(tmp);
        li.removeAll(tmp);
        System.out.println(li);
    }
}
