package staticVariables;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students;

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }


    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Student st: students) {
            sb.append(st);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        University uni = new University();
        uni.addStudent("Meryl Streep");
        uni.addStudent("Morgan Freeman");
        uni.addStudent("Kate Winslet");
        uni.addStudent("Tom Hanks");

        System.out.println(uni);

    }
}
