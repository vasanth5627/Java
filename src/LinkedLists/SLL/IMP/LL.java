package LinkedLists.SLL.IMP;

public class LL {

    private Node head;
    private Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
       private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next= null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }


    }

    public void addFirst(int x){
        Node node  = new Node(x);
        node.next = head;
        head = node;
        if(tail==null){
            tail=node;
        }
        size+=1;
    }

    public void addLast(int x){
        if(tail==null){
            addFirst(x);
            return;
        }
        Node node  = new Node(x);
        tail.next = node;
        tail = node;
        size = size+1;

    }

    public void add(int x, int idx){
        if(idx>size){
            return;
        }

        if(idx==0){
            addFirst(x);
            return;
        }

        if(idx==size){
           addLast(x);
           return;
        }
        Node temp = head;
        int i=1;
        while(i<idx){
            temp = temp.next;
            i++;
        }
        Node node = new Node(x,temp.next);
        temp.next = node;
    }

    public Node deleteFirst(){
        if(head==null) return null;
        Node temp = head;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return temp;

    }

    public Node deleteLast(){
        if(tail == null) return null;
        Node temp = head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        Node t = temp.next;
        temp.next = null;
        temp = tail;
        size--;
        return t;

    }

    public Node delete(int idx){
        if(idx==0){
            return deleteFirst();
        }
        if(idx==size-1){
            return deleteLast();
        }
        Node temp = head;
        int i=1;
        while(i<idx){
            temp = temp.next;
            i++;
        }
        Node t = temp.next;
        temp.next = temp.next.next;
        return t;
    }



    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ->  ");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
    }




}
