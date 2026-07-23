public class Program695 {
    public static void main(String args[]) {
        SinglyList3 sobj = new SinglyList3();
        sobj.insertFirst(11);
        sobj.insertFirst(21);
        sobj.insertFirst(31);
        sobj.insertLast(41);
        sobj.insertLast(51);
        sobj.insertLast(61);
        sobj.display();

    }

}

class node9 {
    public int data;
    public node9 next;

    node9(int no) {
        this.data = no;
        this.next = null;
    }
}

class SinglyList3 {
    private int iCount;
    private node9 first;

    SinglyList3() {
        this.iCount = 0;
        this.first = null;
    }

    void insertFirst(int no) {
        node9 newnode = new node9(no);
        if (first == null) {
            first = newnode;
        } else {
            newnode.next = first;
            first = newnode;
        }
        iCount++;
    }

    void insertLast(int no) {
        node9 newnode = new node9(no);
        if (first == null) {
            newnode = first;
        } else {
            node9 temp = null;
            temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        iCount++;
    }

    void display() {
        while (first != null) {
            System.out.print(first.data + "->");
            first = first.next;
        }

    }
    int count()
    {
        return iCount;
    }
}