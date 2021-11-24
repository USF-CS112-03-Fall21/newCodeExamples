package linkedLists;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(8);
        myList.append(14);
        myList.append(20);
        myList.append(22);
        //System.out.println("Element at the head = " + myList.getHeadValue());
        //System.out.println("Element at the tail = " + myList.getTailValue());

        myList.print();
        // 15 -> 14
        // 0 - > Throw an exception
        // 80 - > 22
        // return the largest value in the linked list which is < elem
        //System.out.println(myList.getLargestValueSmallerThan(15));



    }
}
