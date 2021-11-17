package hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentInfo {
    private Map<String, List<Student>> courseToStudents;

    public StudentInfo() {
        courseToStudents = new HashMap<>();
    }

    public void addStudent(String courseTitle, Student st) {
        List<Student> listOfStudents;
        // TODO:

        if (!courseToStudents.containsKey(courseTitle)) {
            listOfStudents = new ArrayList<>();
            courseToStudents.put(courseTitle, listOfStudents);
        }
        listOfStudents = courseToStudents.get(courseTitle);
        listOfStudents.add(st);
    }

    public List<Integer> getStudentsInBothCourses(String courseTitle1, String courseTitle2) {
        List<Integer> studentIdsBothCourses = new ArrayList<>();

        List<Student> studentsCourse1 = courseToStudents.get(courseTitle1);
        List<Student> studentsCourse2 = courseToStudents.get(courseTitle2);
        Map<Integer, Student> helperMap = new HashMap<>();
        for (Student st: studentsCourse1) {
            helperMap.put(st.getId(), st);
        }

        // TODO:
        for (Student st2: studentsCourse2) {
            int id = st2.getId();
            if (helperMap.containsKey(id))
                studentIdsBothCourses.add(id);
        }

        return studentIdsBothCourses;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String course: courseToStudents.keySet()) {
            sb.append(course + " : ");
            sb.append("{");
            for (Student st: courseToStudents.get(course))
                sb.append(st +  "; ");
            sb.append("}");
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Student st1 = new Student("Kim", 0);
        Student st2 = new Student("Michael", 1);
        Student st3 = new Student("Yuxin", 2);
        Student st4 = new Student("Carlos", 3);
        Student st5 = new Student("Anita", 4);
        Student st6 = new Student("Timothy", 5);

        StudentInfo info = new StudentInfo();
        info.addStudent("CS112", st1);
        info.addStudent("CS112", st2);

        info.addStudent("CS221", st3);
        info.addStudent("CS221", st4);

        info.addStudent("CS245", st3);
        info.addStudent("CS245", st4);
        info.addStudent("CS245", st5);
        info.addStudent("CS245", st6);

        System.out.println(info);

        System.out.println(info.getStudentsInBothCourses("CS245", "CS221"));
    }

}
