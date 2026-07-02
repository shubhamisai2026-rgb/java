public class Program527 
{
    public static void main(String args[])
    {
      Digit dobj=new Digit();
      dobj.display(3425);

    }
}
class Digit
{
    public void display(int num)
    {
      if(num==0)
      {
        return;
      }
      display(num/10);
      System.out.print(num%10+"\t");
    }
}
