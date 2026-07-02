public class Program532
{
    public static void main(String args[])
    {
       Large lobj=new Large();
       lobj.display(8453);
    }
}
class Large
{
    public void display(int num)
    {
       int iDigit=0;int iMax=0;
       while(num!=0)
       {
        iDigit=num%10;
        if(iMax<iDigit)
        {
            iMax=iDigit;
        }
        num=num/10;
       }
       System.out.println("the maximum digit is: "+iMax);
    }
}