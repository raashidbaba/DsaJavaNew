package LinkedList;

public class DoubleLinkedLIst {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;

    }


    public void insertAtLast(int val) {
        //insert at last without tail
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if (head == null) {
            node.previous = head;
            head = node;
            return;
        }


        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.previous = last;
    }


    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("end");

        System.out.println("print in reverse");
        while (last != null) {
            System.out.print(last.val + "->");
            last = last.previous;
        }
        System.out.println("start");
    }


    private class Node {
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
