
public class program692 
{
    public static void main(String args[])
    {
 //  SinglyList sobj=new SinglyList();
 
    }
}

class node6
{
    public int data;
    public node6 next;
    node6(int no)
    {
        this.data=no;
        this.next=null;
    }
}

class SinglyList
{
    public node6 first;
    public int iCount;
    SinglyList()
    {
        System.out.println("inside constructor....");
        this.first=null;
        this.iCount=0;
    }
}
