package day6;

public class Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Motorbike(String model, String color, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
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
/*
    public String info() {
        return "Это мотоцикл";
    }*/
    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference (int yearIn) {
        return yearOfRelease - yearIn;
    }
}
