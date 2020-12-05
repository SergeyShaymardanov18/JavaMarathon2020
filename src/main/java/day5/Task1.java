package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfRelease(1980);
        car.setColor("Red");
        car.setModel("Audi");
        System.out.println("Year of auto release: " + car.getYearOfRelease());
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car model: " + car.getModel());
    }
}
class Car {
    private int yearOfRelease;
    private String color;
    private String model;

    public void setYearOfRelease(int yearOfRelease) {
        if (yearOfRelease <= 0) {
            System.out.println("Vy vveli necorrectnoe znachenie");
        } else {
            this.yearOfRelease = yearOfRelease;
        }
    }

    public int getYearOfRelease () {
        return yearOfRelease;
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
}
