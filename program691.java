public class program691 
{
    public static void main(String args[])
    {
    nodes nobj=new nodes(11);
    System.out.println(nobj.data);
    System.out.println(nobj.next);
    }

}
class nodes
{
    public int data;
    public nodes next;
    nodes(int no)
    {
        this.data=no;
        this.next=null;
    }
}