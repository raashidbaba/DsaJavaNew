package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

   public LL(){
       this.size = 0;
   }

   public void insertAtIndex(int val,int index){
       if (index==0){
           insertFirst(val);
           return;
       }
       if (index==size){
           insertAtLast(val);
           return;
       }

       Node temp = head;
       for (int i = 1; i < index; i++) {
           temp = temp.next;
       }

       Node node = new Node(val,temp.next);
       temp.next = node;
       size++;


   }

   public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       head = node;


       if (head==null){
           tail = head;
       }
       size++;
   }

    public void insertAtLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;







    }
   public void display() {
       Node temp = head;
       while (temp != null) {
           System.out.print(temp.value + "->");
           temp = temp.next;
       }
       System.out.print("end");
   }


public int deleteFirst(){
      int val = head.value;
      head = head.next;
      if (head==null){
          tail = null;
      }
      size--;
      return val;
}

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;;
        tail = secondLast;
        tail.next = null;
        return val;
    }


    public int deleteParticularIndex(int index){
       if (index==0){
           return deleteFirst();
       }
       if (index == size-1){
           return deleteLast();
       }

       //whatever node we want to remove
        //go to previous index
       Node prev = get(index-1);
       int val = prev.next.value;

       return val;


    }

public Node get(int index){
       Node node = head;
    for (int i = 0; i < index; i++) {
        node = node.next;
    }
    return node;
}

public Node find(int value){
       Node node = head;
       while (node != null){
           if (node.value==value){
               return node;
           }
           node = node.next;
       }
       return null;
}



    private class Node{
        private int value;
        private Node next;

        //constructor
        //this constructor only takes value
        //if no ref is provided node is null
        public Node(int value){
            this.value = value;
        }

        //constructor
        //this constructor takes value and node
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
