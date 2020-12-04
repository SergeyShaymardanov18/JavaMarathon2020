package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 100;
        int max_num = 0;
        int min_num = 0;
        long count_elEnd0 = 0;
        long sum_elEnd0 = 0;

        int [] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10001);
        }
        for (int j: num) {
            if (j > max_num) {
                max_num = j;
            }
            if (j < min_num) {
                min_num = j;
            }
            if (j % 10 == 0) {
                count_elEnd0++;
                sum_elEnd0 += j;
            }
        }
        System.out.println(max_num);
        System.out.println(min_num);
        System.out.println(count_elEnd0);
        System.out.println(sum_elEnd0);
    }
}