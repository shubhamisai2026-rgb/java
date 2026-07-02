public class Program533 
{
    public static void main(String args[])
    {
      Small sobj=new Small();
      sobj.display(7345);
    }
}
class Small
{
    public void display(int num)
    {
      int iDigit=0;int iMin=9;
      while(num!=0)
      {
        iDigit=num%10;
        if(iMin>iDigit)
        {
            iMin=iDigit;
        }
        num=num/10;
      }
      System.out.println("the minimum number is: "+iMin);
    }
}