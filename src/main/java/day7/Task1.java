package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Boing",2010,50,20000);
        Airplane air2 = new Airplane("Il",2015,70,30000);

        Airplane.compareAirplanes(air1, air2);
    }
}