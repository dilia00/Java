package Homework_2;

public class Task {
    public static void reverseStr(String[] strArr, int i1, int i2) {
        if (i1 < i2) {
            String tmp = strArr[i1];
            strArr[i1] = strArr[i2];
            strArr[i2] = tmp;
            reverseStr(strArr, i1 + 1, i2 - 1);
        }
    }

    public static void main(String[] args) {
        // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы
        // другой строки).
        System.out.println("\n1.");
        String str = "I love Java";
        String subStr = "lo";
        System.out.println("Вхождение подстроки: " + subStr + " в стороке: " + str +
                " под индексом: " + str.indexOf(subStr));

        // 2. Напишите программу, чтобы проверить, являются ли две данные строки
        // вращением друг друга (вхождение в обратном порядке).
        System.out.println("\n2.");
        String str1 = "love";
        String subStr1 = "evol";
        StringBuilder sb = new StringBuilder(subStr1);
        String s = sb.reverse().toString();
        if (str1.equals(s))
            System.out.println("Две строки " + str1 + " и " + subStr1 + " являются вращением друг друга");
        else
            System.out.println("Две строки " + str1 + " и " + subStr1 + " не являются вращением друг друга");

        // 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        System.out.println("\n3.");
        String[] strArray = str.split("");
        int size = strArray.length;
        int index1 = 0;
        int index2 = size - 1;
        reverseStr(strArray, index1, index2);
        System.out.println(String.join("", strArray));

        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод
        // StringBuilder.append().
        System.out.println("\n4.");
        int a = 3;
        int b = 56;
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sum);
        StringBuilder dif = new StringBuilder();
        dif.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(dif);
        StringBuilder mult = new StringBuilder();
        mult.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(mult);

        // 5. Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println("\n5.");
        int index = mult.indexOf("=");
        System.out.println(sum.deleteCharAt(index).insert(index, "равно"));
        System.out.println(dif.deleteCharAt(index).insert(index, "равно"));

        // 6. *Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.replace().
        System.out.println("\n6.");
        System.out.println(mult.replace(index, index + 1, "равно"));

        // 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов
        // "="
        // средствами String и StringBuilder.
        System.out.println("\n7.");
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            mult.replace(index, index + 1, "равно");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end1 - start1));

        String str2 = "3 * 56 = 168";
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            str2.replace("=", "равно");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("String time: " + (end2 - start2));

        System.out.println("Difference: " + ((end2 - start2) - (end1 - start1)));
    }
}
