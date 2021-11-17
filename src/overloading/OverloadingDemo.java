package overloading;

public class OverloadingDemo {
    public static void main(String[] args) {

        OverloadingEx obj = new OverloadingEx();
        obj.disp('c');
        obj.disp("hohoho");
        obj.disp('c', 5);
    }
}

