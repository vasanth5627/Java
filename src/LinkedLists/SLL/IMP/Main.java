package LinkedLists.SLL.IMP;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);
        list.add(50,2);
        list.add(100,3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();

    }
}
