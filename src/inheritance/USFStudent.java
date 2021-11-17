package inheritance;


import java.util.HashMap;
import java.util.Map;

public class USFStudent extends USFPerson {
    private String program; // Bachelors or Masters
    private Map<Integer, Double> transcript;

    public USFStudent(String name, int id, String program) {
        super(name, id);
        this.program = program;
        transcript = new HashMap<>();
    }

    public void updateTranscript(int courseId, double grade) {
        transcript.put(courseId, grade);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Program: " + program);
        System.out.println(transcript);
    }

}
