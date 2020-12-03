package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double numerator = scanner.nextDouble();
            double denominator = scanner.nextDouble();

            if (denominator == 0) {
                break;
            } else {
                System.out.println(numerator / denominator);
            }
        }
    }
}
