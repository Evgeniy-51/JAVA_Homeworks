// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет  его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five", "Six"));

        MyClass que = new MyClass();

        que.addList(lst);
        que.sout();

        System.out.println("******** enqueue() **********");
        que.enqueue("Seven");
        que.sout();

        System.out.println("******** dequeue() **********");
        System.out.println(que.dequeue());
        que.sout();

        System.out.println("******** first() **********");
        System.out.println(que.first());
        que.sout();
    }
}