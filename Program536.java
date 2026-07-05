public class Program536 
{
    public static void main(String args[])
    {
      Factors fobj=new Factors();
      fobj.display(432);
    }
}
class Factors
{
    public void display(int num)
    {
      System.out.println("factors of the numbers are:");
      for(int i=1;i<=(num/2);i++)
      {
        if(num%i==0)
        {
            System.out.println(i);
        }
      }
    }
}