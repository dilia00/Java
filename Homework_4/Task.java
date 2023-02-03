package Homework_4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {

        // 1. Сохранить в файл строку и загрузить из файла строку с выводом в консоль
        // используя классы FileWriter и FileReader
        try {
            FileWriter fw = new FileWriter("1.txt");
            fw.append("Петров " + "Александр " + "Николаевич " + "23" + " Мужской" + "\n");
            fw.append("Иванов " + "Борис " + "Борисович " + "45" + " Мужской" + "\n");
            fw.append("Сидоров " + "Виктор " + "Викторович " + "22" + " Мужской" + "\n");
            fw.append("Сергеева " + "Кира " + "Викторовна " + "33" + " Женский" + "\n");
            fw.append("Федорова " + "Вера " + "Павловна " + "34" + " Женский" + "\n");
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через
        // пробелы.
        // Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
        // 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки.
        // Фамилии, имена, отчества, возрас и пол в отдельных списках.

        try {
            FileReader fr = new FileReader("1.txt");
            String text = "";
            while (fr.ready()) {
                text += (char) fr.read();
            }
            String[] parts = text.split("\n");

            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> lastname = new ArrayList<>();
            ArrayList<String> fatname = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<Boolean> sex = new ArrayList<>();
            ArrayList<Integer> id = new ArrayList<>();
            for (int i = 0; i < parts.length; i++) {
                String[] tmp = parts[i].split(" ");
                lastname.add(tmp[0]);
                name.add(tmp[1]);
                fatname.add(tmp[2]);
                age.add(Integer.parseInt(tmp[3]));
                sex.add(tmp[4].contains("у") ? false : true);
                id.add(i);
                System.out.println(tmp[0] + " " + tmp[1].charAt(0) + "." + tmp[2].charAt(0) + ". " + tmp[3] + " "
                        + tmp[4].charAt(0));
            }

            // 4.Отсортировать по возрасту используя дополнительный список индексов.
            System.out.println();
            ArrayList<Integer> tmpAge = new ArrayList<>(age);
            for (int i = 0; i < tmpAge.size() - 1; i++) {
                int MinIndex = i;
                for (int j = i + 1; j < tmpAge.size(); j++) {
                    if (tmpAge.get(j) < tmpAge.get(MinIndex))
                        MinIndex = j;
                }
                int temp;
                temp = tmpAge.get(MinIndex);
                tmpAge.set(MinIndex, tmpAge.get(i));
                tmpAge.set(i, temp);
                temp = id.get(MinIndex);
                id.set(MinIndex, id.get(i));
                id.set(i, temp);
            }

            StringBuilder sortedList = new StringBuilder("");
            for (int j = 0; j < age.size(); j++) {
                int i = id.get(j);
                sortedList
                        .append(lastname.get(i))
                        .append(" ")
                        .append(name.get(i).charAt(0))
                        .append(".")
                        .append(fatname.get(i).charAt(0))
                        .append(". ")
                        .append(age.get(i))
                        .append("\n");
            }
            System.out.println(sortedList);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
