package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int more_8 = 0;
        int equal_1 = 0;
        int even_num = 0;
        int odd_num = 0;
        int sum_num = 0;

        int [] num = new int[len];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(11);
            if (num[i] > 8) {
                more_8++;
            }
            if (num[i] == 1) {
                equal_1++;
            }
            if (num[i] % 2 == 0) {
                even_num++;
            }
            if (num[i] % 2 != 0) {
                odd_num++;
            }
            sum_num += num[i];
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Длина массива: " + num.length);
        System.out.println("Количество чисел больше 8: " + more_8);
        System.out.println("Количество чисел равных 1: " + equal_1);
        System.out.println("Количество четных чисел: " + even_num);
        System.out.println("Количество нечетных чисел: " + odd_num);
        System.out.println("Сумма всех элементов массива: " + sum_num);
    }
}
