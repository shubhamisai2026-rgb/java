public class Program521 
{
    public static void main(String args[])
    {
      PosNeg pobj=new PosNeg();
      pobj.display(-3);
    }
}
class PosNeg
{
    public void display(int num)
    {
      if(num==0)
      {
        System.out.println("number is zero...");
      }
      else if(num<0)
      {
        System.out.println("number is negative...");
      }
      else
      {
        System.out.println("number is positive...");
      }
    }
}