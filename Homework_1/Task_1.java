// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {

        int i = new Random().nextInt(2000);
        int n = Integer.toBinaryString(i).length() - 1;
        int aliquotСount = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                aliquotСount += 1;
            }
        }
        int[] m1 = new int[aliquotСount];
        int j = 0;
        for (int index = i; index < Short.MAX_VALUE; index++) {
            if (index % n == 0) {
                m1[j] = index;
                j++;
            }
        }
        int notAliquotСount = 0;
        for (int m = Short.MIN_VALUE; m < i; m++) {
            if (m % n != 0) {
                notAliquotСount += 1;
            }
        }
        int[] m2 = new int[notAliquotСount];
        int k = 0;
        for (int index = Short.MIN_VALUE; index < i; index++) {
            if (index % n != 0) {
                m2[k] = index;
                k++;
            }
        }
    }
}
