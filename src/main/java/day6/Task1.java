package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Java","Red",1990);
        Car car = new Car();

        motorbike.info();
        System.out.println(" Difference " + motorbike.yearDifference(2020));

        car.setYear(2010);
        car.info();
        System.out.println(" Difference " + car.yearDifference(2020));
    }
}
