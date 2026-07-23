public class Program696{
    public static void main(String args[]) {
        SinglyList4 sobj = new SinglyList4();
        sobj.insertFirst(11);
        sobj.insertFirst(21);
        sobj.insertFirst(31);
        sobj.insertLast(41);
        sobj.insertLast(51);
        sobj.insertLast(61);
        sobj.display();

        System.out.println("\n");
        int iRet=sobj.count();
        System.out.println("total nodes are:"+iRet);
    }

}

class node10 {
    public int data;
    public node10 next;

    node10(int no) {
        this.data = no;
        this.next = null;
    }
}

class SinglyList4 {
    private int iCount;
    private node10 first;

    SinglyList4() {
        this.iCount = 0;
        this.first = null;
    }

    void insertFirst(int no) {
        node10 newnode = new node10(no);
        if (first == null) {
            first = newnode;
        } else {
            newnode.next = first;
            first = newnode;
        }
        iCount++;
    }

    void insertLast(int no) {
        node10 newnode = new node10(no);
        if (first == null) {
            newnode = first;
        } else {
            node10 temp = null;
            temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        iCount++;
    }

    void display() {
        node10 temp=null;
        temp=first;
        while (temp != null) {
            System.out.print(first.data + "->");
            temp = temp.next;
        }
    }
    int count()
    {
        return iCount;
    }
}