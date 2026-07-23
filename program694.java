public class program694 
{
    public static void main(String args[])
    {
    SinglyList2 sobj=new SinglyList2();
    sobj.insertFirst(11);
    sobj.insertFirst(21);
    sobj.insertFirst(31);
    sobj.display();

    }
}
class node8
{
    public int data;
    public node8 next;
    node8(int no)
    {
        this.data=no;
        this.next=null;
    }
}

class SinglyList2
{
    private node8 first;
    private int iCount;
    SinglyList2()
    {
        this.first=null;
        this.iCount=0;
    }
    void insertFirst(int no)
    {
        node8 newnode=new node8(no);
        if(first==null)
        {
            first=newnode;
        }
        else
        {
            newnode.next=first;
            first=newnode;
        }
        iCount++;
    }

    void display()
    {
        while(first!=null)
        {
            System.out.print(first.data+"->");
            first=first.next;
        }
    }

    int count()
    {
        return iCount;
    }
}