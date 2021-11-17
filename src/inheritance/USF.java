package inheritance;

import java.util.ArrayList;
import java.util.List;

public class USF {
    private List<USFPerson> usfPersonList  = new ArrayList<>();

    public void addPerson(USFPerson p) {
        usfPersonList.add(p);
    }

    public static void main(String[] args) {

        USFPerson person1 = new USFFaculty("Janet Smith", 10, 456, "Full Professor");
        person1.print();
        person1 = new USFStudent("Carlos Hernandez", 22, "MSCS");
        person1.print();
        person1 = new USFStaff("Ivan Ivanov", 30, 56, 21 );
        person1.print();

        //System.out.println("-------");
        //person2.print();
        //System.out.println("-------");
        //person3.print();


        //person2.print();
    }
}
