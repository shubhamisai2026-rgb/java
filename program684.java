
class Program684
{
    public static void main(String args[])
    {
        node newnode=null;
        newnode=new node();
        newnode.data=11;
        newnode.next=null;
        System.out.println(newnode.data);
        System.out.println(newnode.next);
      
    }
}
class node
{
    public int data;
    public node next;
}
