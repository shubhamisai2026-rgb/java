public class Program689 
{
    public static void main(String args[])
    {
        node5 head=null;

        node5 obj1=null;
        node5 obj2=null;
        node5 obj3=null;

        obj1=new node5();
        obj2=new node5();
        obj3=new node5();

        obj1.data=11;
        obj2.data=21;
        obj3.data=31;

        obj1.next=obj2;
        obj2.next=obj3;
        obj3.next=null;

        head=obj1;
        node5 temp=head;
        
        System.out.println(temp.data);
        temp=temp.next;
        System.out.println(temp.data);
        temp=temp.next;
        System.out.println(temp.data);
        temp=temp.next;
    }
}

class node5
{
    public int data;
    public node5 next;
}