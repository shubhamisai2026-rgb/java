import java.util.Scanner;
class Program47
{
    public static void main(String[] args) {
    Scanner sobj=new Scanner(System.in);
    int iValue=0;
    System.out.println("enter your number:");
    iValue=sobj.nextInt();
    NumberX.FindFactors(iValue);
    sobj.close();
    }
}
class NumberX
{
    public static void FindFactors(int iNo)
    {
        int i=0;
        for(i=1;i<=(iNo/2);i++)
        {
            if(iNo%i==0)
            {
            System.out.println(i);
            }
        }
    }
}
//Timecomplexity:O(N)
//N>=0