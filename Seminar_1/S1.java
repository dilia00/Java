import java.util.Arrays;
import java.util.Random;

/**
 * S1
 */
public class S1 {

    public static void main(String[] args) {

        int[] ints = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rnd.nextInt(500);
        }
        System.out.println(Arrays.toString(ints));

        String str = "Кофе, дерево, кабан! " + "Дорога, степь";
        str += "!";
        String[] splitStr = str.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].contains(",") | splitStr[i].contains("!")) {
                splitStr[i] = splitStr[i].substring(0, splitStr[i].length() - 1);
            }
        }
        System.out.println(Arrays.toString(splitStr));

        int[] tmp = new int[ints.length + 1];
        tmp[0] = 5;
        for (int i = 1; i < tmp.length; i++) {
            tmp[i] = ints[i - 1];
        }
        ints = tmp;

        System.out.println(String.valueOf(4.2f));
        Integer.parseInt("225");
        System.out.println(Integer.toBinaryString(9).length());
    }
}