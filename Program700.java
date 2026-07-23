public class Program700 {
    public static void main(String args[]) {
        SinglyList dobj = new SinglyList();
        dobj.insertFirst(11);
        dobj.insertFirst(21);
        dobj.insertFirst(31);
        dobj.display();
        int iRet = 0;
        iRet = dobj.count();
        System.out.println("total nodes are:" + iRet);

        dobj.insertLast(41);
        dobj.insertLast(51);
        dobj.insertLast(61);
        dobj.display();
        iRet = dobj.count();
        System.out.println("total nodes are:" + iRet);

        dobj.insertAtPos(71, 2);
        dobj.insertAtPos(81, 2);
        dobj.insertAtPos(91, 2);
        dobj.display();
        iRet = dobj.count();
        System.out.println("total nodes are:" + iRet);

        dobj.deleteFirst();
        dobj.display();
        iRet = dobj.count();
        System.out.println("total nodes are:" + iRet);

        dobj.deleteLast();
        dobj.display();
        iRet = dobj.count();
        System.out.println("total nodes are:" + iRet);

        dobj.deleteAtPos(2);
        dobj.display();
        iRet = dobj.count();
        System.out.println("total nodes are:" + iRet);
    }
}

class node {
    public int data;
    public node next;

    node(int no) {
        this.data = no;
        this.next = null;
    }
}

class SinglyList {
    private int iCount;
    private node first;
    private node last;

    SinglyList() {
        this.iCount = 0;
        this.first = null;
        this.last = null;
    }

    void insertFirst(int no) {
        node newnode = new node(no);
        if (first == null && last == null) {
            first = newnode;
            last = newnode;
        } else {
            newnode.next = first;
            first = newnode;
        }
        last.next = first;
        iCount++;
    }

    void insertLast(int no) {
        node newnode = new node(no);
        if (first == null && last == null) {
            first = newnode;
            last = newnode;
        } else {
            last.next = newnode;
            last = newnode;
        }
        last.next = first;
        iCount++;
    }

    void insertAtPos(int no, int pos) {
        if (pos < 1 || pos > iCount + 1) {
            System.out.println("invalid position...");
            return;
        }
        if (pos == 1) {
            insertFirst(no);
        } else if (pos == iCount + 1) {
            insertLast(no);
        } else {
            node newnode = new node(no);
            int i = 0;
            node temp = null;
            temp = first;
            for (i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        iCount++;
    }

    void deleteFirst() {
        if (first == null) {
            return;
        } else if (first.next == null) {
            first = null;
        } else {
            first = first.next;
        }
        last.next = null;
        iCount--;
    }

    void deleteLast() {
        if (first == null) {
            return;
        } else if (first.next == null) {
            first = null;
        } else {
            node temp = null;
            temp = first;
            while (temp.next != last) {
                temp = temp.next;
            }
            last = temp;
            last.next = first;
        }
        iCount--;
    }

    void deleteAtPos(int pos) {
        if (pos < 1 || pos > iCount) {
            System.out.println("invalid position...");
            return;
        }
        if (pos == 1) {
            deleteFirst();
        } else if (pos == iCount) {
            deleteLast();
        } else {
            int i = 0;
            node temp = null;
            temp = first;
            for (i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
           
            temp.next = temp.next.next;
            iCount--;
        }
    }

    void display() {
        node temp = null;
        temp = first;
        if (first == null && last == null) {
            return;
        }
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("null");
    }

    int count() {
        return iCount;
    }
}
