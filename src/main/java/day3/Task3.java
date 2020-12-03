package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            double numerator = scanner.nextDouble();
            double denominator = scanner.nextDouble();

            if (denominator != 0) {
                System.out.println(numerator / denominator);
                continue;
            }
            System.out.println("Деление на 0");
        }
    }
}
