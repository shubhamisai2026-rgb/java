public class Program534 
{
    public static void main(String args[])
    {
      Product pobj=new Product();
      pobj.display(4252);
    }
}
class Product
{
    public void display(int num)
    {
      int iDigit=0; int iMul=1;
      while(num!=0)
      {
        iDigit=num%10;
        iMul=iDigit*iMul;
        num=num/10;
      }
      System.out.println("multiplication of the digits is: "+iMul);
    }
}