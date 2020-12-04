package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int size = 100;
        int sum_3elem = 0;
        int index = 0;
        int car[] = new int[size];
        int sumMass[] = new int[size];

        Random random = new Random();

        for (int i = 0; i < car.length; i++) {
            car[i] = random.nextInt(10001);
        }

        for (int i = 1; i < car.length - 1; i++) {
            sumMass[i] = car[i - 1] + car[i] + car[i + 1];
        }

        for (int j = 0; j < sumMass.length; j++) {
            if (sum_3elem < sumMass[j]) {
                sum_3elem = sumMass[j];
                index = j - 1;
            }
        }
        System.out.println(Arrays.toString(sumMass));
        System.out.println(sum_3elem);
        System.out.println(index);
    }
}
