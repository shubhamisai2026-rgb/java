public class Program688
{
    public static void main(String args[])
    {
        node4 head=null;

        node4 obj1=null;
        node4 obj2=null;
        node4 obj3=null;

        obj1=new node4();
        obj2=new node4();
        obj3=new node4();

        obj1.data=11;
        obj2.data=21;
        obj3.data=31;

        obj1.next=obj2;
        obj2.next=obj3;
        obj3.next=null;

        head=obj1;
        System.out.println(head.data);
        head=head.next;
        System.out.println(head.data);
        head=head.next;
        System.out.println(head.data);
        head=head.next;
    }
}

class node4
{
    public int data;
    public node4 next;
}

