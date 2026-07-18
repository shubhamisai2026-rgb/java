public class Program690
{
    public static void main(String args[])
    {
        node6 head=null;

        node6 obj1=null;
        node6 obj2=null;
        node6 obj3=null;

        obj1=new node6();
        obj2=new node6();
        obj3=new node6();

        obj1.data=11;
        obj2.data=21;
        obj3.data=31;

        obj1.next=obj2;
        obj2.next=obj3;
        obj3.next=null;

        head=obj1;
        node6 temp=head;
       while(temp!=null)
       {
         System.out.println(temp.data);
         temp=temp.next;
       }
    }
}

class node6
{
    public int data;
    public node6 next;
}