
public class Program516 
{
    public static void main(String args[])
    {
      MaxNumber mobj=new MaxNumber();
      mobj.display(12,45,75);
    }
}
class MaxNumber
{
    public void display(int a,int b,int c)
    {
      if(a>b && a>c)
      {
        System.out.println("a is greater....");
      }
      else if(b>a && b>c)
      {
        System.out.println("b is greater....");
      }
      else
      {
        System.out.println("c is greater....");
      }
    }
}