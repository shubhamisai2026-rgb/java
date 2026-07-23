public class Program699 
{
    public static void main(String args[]) 
    {
        DoublyList dobj=new DoublyList();
        dobj.insertFirst(11);
        dobj.insertFirst(21);
        dobj.insertFirst(31);
        dobj.display();

        dobj.insertLast(41);
        dobj.insertLast(51);
        dobj.insertLast(61);
        dobj.display();

        dobj.insertAtPos(71,2);
        dobj.insertAtPos(81,2);
        dobj.insertAtPos(91,2);
        dobj.display();

        dobj.deleteFirst();
        dobj.deleteLast();
        dobj.deleteAtPos(2);
        dobj.display();

        int iRet=0;
        iRet=dobj.count();
        System.out.println("total nodes are:"+iRet);
        dobj.display();
    }
}

class node {
    public int data;
    public node prev;
    public node next;

    node(int no) {
        this.data = no;
        this.prev = null;
        this.next = null;
    }
}

class DoublyList {
    private int iCount;
    private node first;

    DoublyList() {
        this.iCount = 0;
        this.first = null;
    }

    void insertFirst(int no) 
    {
        node newnode = new node(no);
        if (first == null) 
            {
            first = newnode;
        } 
        else 
            {
            newnode.next = first;
            first.prev = newnode;
            first = newnode;
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
            newnode.prev=temp;
            temp.next=newnode;
        }
        iCount++;
    }

    void insertAtPos(int no,int pos)
    {
      if((pos<1 || pos>iCount+1))
      {
         System.out.println("invalid position....");
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
        node newnode=new node(no);
        newnode.next=null;
        newnode.prev=null;
        int i=0;
        node temp=null;
        temp=first;
        for(i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
       newnode.prev=temp;
       newnode.next=temp.next;
       temp.next.prev=newnode;
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
            temp.next.next.prev=temp.next;
            temp.next=temp.next.next;
        }
        iCount--;
    }

    int count()
    {
        return iCount;
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
        System.out.println("null");
    }
}