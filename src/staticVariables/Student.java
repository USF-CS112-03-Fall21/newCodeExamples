package staticVariables;

public class Student {
    private String name;
    private int id;

    private static int numStudents = 0;

    public Student(String name) {
        this.name = name;
        // FILL IN CODE
    }

    @Override
    public String toString() {
        return name + " " + id;
    }

    public  static void setNumStudents(int n) {
        numStudents = n;
    }


    public static void main(String[] args) {
        Student s1  = new Student("Jason Lee");
        Student s2 = new Student("Jennifer Hernandez");

        //Student.setNumStudents(4);
    }

}
