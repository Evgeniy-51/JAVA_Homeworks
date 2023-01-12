import java.util.LinkedList;

public class MyClass {
    LinkedList<String> MyLst = new LinkedList<>();

    public void addList(LinkedList<String> lst) {

        MyLst.addAll(lst);
    }

    public void sout() {

        System.out.println(MyLst);
    }

    public void enqueue(String elem) {

        MyLst.addLast(elem);
    }

    public String dequeue() {

        return MyLst.pollFirst();
    }

    public String first() {

        return MyLst.peekFirst();
    }
}
