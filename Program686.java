
public class Program686 {
    public static void main(String args[]) {
       // node1 head = null;

        node1 obj1 = null;
        node1 obj2 = null;
        node1 obj3 = null;

        obj1=new node1();
        obj2=new node1();
        obj3=new node1();

        obj1.data = 11;
        obj2.data = 21;
        obj3.data = 31;

        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = null;

       // head = obj1;

        System.out.println(obj1.data);
        System.out.println(obj2.data);
        System.out.println(obj3.data);

    }
}

class node1 {
    public int data;
    public node1 next;
}
