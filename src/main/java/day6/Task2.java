package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("TU",2015,50, 20000);

        airplane.setYearOfRelease(2020);
        airplane.setLength(80);

        airplane.fillUp(500);
        airplane.fillUp(1000);
        airplane.info();
    }
}
