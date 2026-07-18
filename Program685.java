public class Program685 {
    public static void main(String args[]) {
        node2 newnode = null;
        newnode = new node2();
        newnode.data = 23;
        newnode.next = null;
        System.out.println(newnode.data);
        System.out.println(newnode.next);

        node2 newnode2 = null;
        newnode2 = new node2();
        newnode.next = newnode2;
        newnode2.data = 45;
        newnode2.next=null;

        System.out.println(newnode2.data);
        System.out.println(newnode2.next);
    }
}

class node2 {
    public int data;
    public node2 next;
}
