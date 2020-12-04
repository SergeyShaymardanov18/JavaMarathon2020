package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int sum_max = 0;
        int index_sumMax = 0;
        int matrix [][] = new int[m][n];
        int sum_str [] = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }
        // sozdadim odnomerny massiv, i zapolnim summ kajdoy stroki
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum_str[i] += matrix[i][j];
            }
        }

        // iz odnomern massiva naidem max
        for (int i = 0; i < 12; i++) {
            if (sum_str[i] > sum_max) {
                sum_max = sum_str[i];
                index_sumMax = i;
            }
        }
        System.out.println(index_sumMax);
    }
}
