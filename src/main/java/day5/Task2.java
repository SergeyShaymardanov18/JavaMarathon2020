package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2000,"Green","Ural");
        System.out.println("Motorbike: " + motorbike.getYearOfRelease() + ", "
                + motorbike.getColor() + ", " + motorbike.getModel());
    }
}

class Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Motorbike (int yearOfRelease, String color, String model){
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.model = model;
        }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
