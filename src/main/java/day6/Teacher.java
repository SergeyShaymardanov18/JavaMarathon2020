package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate () {
        switch (random.nextInt(4 + 2)) {
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            default:
                System.out.println("Два");
        }
    }
}
