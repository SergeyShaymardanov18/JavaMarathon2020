package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ольга", "ИЗО");
        Student student = new Student("Максим");

        System.out.print("Преподаватель " + teacher.getName() + " оценил студента с именем " +
                student.getName() + " по предмету " + teacher.getSubject() +
                " на оценку ");
        teacher.evaluate();
    }
}
