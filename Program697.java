public class Program697 {
    public static void main(String args[]) {
        SinglyList4 sobj = new SinglyList4();
        sobj.insertFirst(11);
        sobj.insertFirst(21);
        sobj.insertFirst(31);
        sobj.insertLast(41);
        sobj.insertLast(51);
        sobj.insertLast(61);
        sobj.display();

        int iRet = sobj.count();
        System.out.println("total nodes are:" + iRet);

        sobj.deleteFirst();
        iRet = sobj.count();
        System.out.println("total nodes are:" + iRet);
        sobj.display();

        sobj.deleteLast();
        iRet = sobj.count();
        System.out.println("total nodes are:" + iRet);
        sobj.display();

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

    public void insertFirst(int no) {
        node10 newnode = new node10(no);
        if (first == null) {
            first = newnode;
        } else {
            newnode.next = first;
            first = newnode;
        }
        iCount++;
    }

    public void insertLast(int no) {
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

    public void display() {
        node10 temp = null;
        temp = first;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public int count() {
        return iCount;
    }

    public void deleteFirst() {
        if (first == null) {
            return;
        } else if (first.next == null) {
            first = null;
        } else {
            first = first.next;
        }
        iCount--;
    }

    public void deleteLast() {
        if (first == null) {
            return;
        } else if (first.next == null) {
            first = null;
        } else {
            node10 temp = null;
            temp = first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        iCount--;
    }
}