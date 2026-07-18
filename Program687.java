
public class Program687 {
    public static void main(String args[]) {
        node3 head = null;

        node3 obj1 = null;
        node3 obj2 = null;
        node3 obj3 = null;

        obj1 = new node3();
        obj2 = new node3();
        obj3 = new node3();

        obj1.data = 11;
        obj2.data = 21;
        obj3.data = 31;

        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = null;

        head = obj1;

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}

class node3 {
    public int data;
    public node3 next;
}