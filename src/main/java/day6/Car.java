package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int yearOfRelease) {
        if (yearOfRelease <= 0) {
            System.out.println("Vy vveli necorrectnoe znachenie");
        } else {
            this.year = yearOfRelease;
        }
    }

    public int getYear () {
        return year;
    }

    public void setColor (String color) {
        if (color.isEmpty()) {
            System.out.println("Vy vveli pustoe slovo");
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Vy vveli pustoe slovo");
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int yearIn) {
        return year - yearIn;
    }
}