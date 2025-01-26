package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(11);
        list.insertAtLast(99);
        list.insertAtIndex(277,3);
        System.out.println( list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

    }
}
