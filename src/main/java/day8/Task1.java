package day8;

public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            System.out.print(i + " ");
        }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i + " ");
            System.out.print(sb.toString());
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;

        System.out.println();
        System.out.println("Время конкатенацией " + timeConsumedMillis1);
        System.out.println("Время StringBuilder " + timeConsumedMillis2);
    }
}
