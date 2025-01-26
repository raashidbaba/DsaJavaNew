package LinkedList;

public class DoubleLinkedLIst {


    private class Node{
        int val;
        Node next;
        Node previous;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node previous) {
            this.val = val;
            this.next = next;
            this.previous = previous;
        }
    }
}
