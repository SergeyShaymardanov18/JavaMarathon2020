package day7;

public class Airplane {

    private String producer;
    private int yearOfRelease;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int yearOfRelease, int length, int weight) {
        this.producer = producer;
        this.yearOfRelease = yearOfRelease;
        this.length = length;
        this.weight = weight;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
    }

    public void fillUp(int fuel) {
        if (fuel <= 0) {
            System.out.println("Vy vveli necorrectnoe znachenie");
        } else {
            this.fuel = this.fuel + fuel;
        }
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + yearOfRelease +
                ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane air1, Airplane air2) {
        if (air1.length == air2.length) {
            System.out.println("Длины самолетов равны");
        }
        else if (air1.length > air2.length) {
            System.out.println("Первый самолет длиннее");
        }
        else {
            System.out.println("Второй самолет длиннее");
        };
    }
}
