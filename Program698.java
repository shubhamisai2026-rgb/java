public class Program698 
{
    public static void main(String args[])
    {
        SinglyList sobj=new SinglyList();
        int iRet=0;
    sobj.insertFirst(11);
    sobj.insertFirst(21);
    sobj.insertFirst(31);
    sobj.display();
    iRet=sobj.count();
    System.out.println("total nodes are:"+iRet);

    sobj.insertLast(31);
    sobj.insertLast(41);
    sobj.insertLast(51);
     sobj.display();
    iRet=sobj.count();
    System.out.println("total nodes are:"+iRet);

    sobj.insertAtPos(34,2);
    sobj.insertAtPos(54,2);
    sobj.insertAtPos(45,2);
     sobj.display();
    iRet=sobj.count();
    System.out.println("total nodes are:"+iRet);

    sobj.deleteFirst();
     sobj.display();
    iRet=sobj.count();
    System.out.println("total nodes are:"+iRet);

    sobj.deleteLast();
     sobj.display();
    iRet=sobj.count();
    System.out.println("total nodes are:"+iRet);

    sobj.deleteAtPos(3);
     sobj.display();
    iRet=sobj.count();
    System.out.println("total nodes are:"+iRet);

    }
}
class node
{
    public int data;
    public node next;
    node(int no)
    {
        this.data=no;
        this.next=null;
    }
}
 class SinglyList
 {
    private int iCount;
    private node first;
    SinglyList()
    {
        this.iCount=0;
        this.first=null;
    }
    void insertFirst(int no)
    {
        node newnode=new node(no);
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

    void insertLast(int no)
    {
        node newnode=new node(no);
        if(first==null)
        {
            first=newnode;
        }
        else
        {
            node temp=null;
            temp=first;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
        iCount++;
    }

    void deleteFirst()
    {
        if(first==null)
        {
           return;
        }
        else if(first.next==null)
        {
           first=null;
        }
        else
        {
            first=first.next;
        }
        iCount--;
    }
    void deleteLast()
    {
        if(first==null)
        {
            return;
        }
        else if(first.next==null)
        {
            first=null;
        }
        else
        {
            node temp=null;
            temp=first;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        iCount--;
    
    }

   void insertAtPos(int no,int pos)
    {
       if(pos<1 || pos>iCount+1)
       {
        System.out.println("invalid position...");
        return;
       }
       if(pos==1)
       {
        insertFirst(no);
       }
       else if(pos==iCount+1)
       {
        insertLast(no);
       }
       else
       {
        int i=0;
          node newnode=new node(no);
        node temp=null;
        temp=first;
        for(i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
       }
       iCount++;
    }

    void deleteAtPos(int pos)
    {
        if(pos<1 || pos>iCount)
        {
            System.out.println("invalid position...");
            return;
        }
        if(pos==1)
        {
            deleteFirst();
        }
        else if(pos==iCount)
        {
            deleteLast();
        }
        else
        {
            int i=0;
            node temp=null;
            temp=first;
            for(i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        iCount--;
    }
    void display()
    {
        node temp=null;
        temp=first;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
           temp=temp.next;
        }
        System.out.print("null\n");
    }

    int count()
    {
        return iCount;
    }
 }


