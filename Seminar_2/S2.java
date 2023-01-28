package Seminar_2;

public class S2 {
    public static void main(String[] args) {

        StringBuilder stb = new StringBuilder();
        stb.append(5);
        stb.append('A');
        stb.append(false);
        stb.append("Hello!");
        stb.append(1.23);
        System.out.println(stb);

        StringBuilder sb2 = new StringBuilder();
        sb2.append(5);
        sb2.append('A');
        sb2.append(false);
        sb2.append("Hello!");
        sb2.append(1.23);
        System.out.println(sb2);

        System.out.println(stb.toString().equals(sb2.toString()));
        System.out.println(stb == sb2);

        int a = 3;
        int b = 56;

        StringBuilder sum = new StringBuilder();
        sum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        // System.out.println(sum);
        System.out.println(sum.replace(7, 8, "равно"));

        StringBuilder dif = new StringBuilder();
        dif
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
        // System.out.println(dif);
        System.out.println(dif.replace(7, 8, "равно"));

        StringBuilder mult = new StringBuilder();
        mult
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        // System.out.println(mult);
        System.out.println(mult.replace(7, 8, "равно"));

        StringBuilder div = new StringBuilder();
        div
                .append(a)
                .append(" / ")
                .append(b)
                .append(" = ")
                .append(a / b);
        // System.out.println(mult);
        System.out.println(mult.replace(7, 8, "равно"));

        StringBuilder strBuilder = new StringBuilder();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            strBuilder.append("R ");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end1 - start1));

        String str = "";
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            str += "R ";
        }
        long end2 = System.currentTimeMillis();
        System.out.println("String time: " + (end2 - start2));

        System.out.println("Difference: " + ((end2 - start2) - (end1 - start1)));

    }
}
