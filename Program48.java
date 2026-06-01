import java.util.Scanner;
class Program48
{
    public static void main(String[] args)
    {
        Scanner sobj=new Scanner(System.in);
        int iValue=0;int iResult=0;
        System.out.println("enter your number:");
        iValue=sobj.nextInt();
        //NumberX nobj=new NumberX()
        //iResult=nobj.SumFactors(iValue)
        iResult=NumberX.SumFactors(iValue);
        System.out.println("Sum Of Fasctors:"+iResult);
        sobj.close();
    }
}
class NumberX
{
    public static int SumFactors(int iNo)
    {
        int i=0;
        int iSum=0;
        for(i=1;i<=(iNo/i);i++)
        {
            if(iNo%i==0)
            {
                iSum=i+iSum;
            }
        }
        return iSum;
    }
}
//Time complexity:O(N)
//N>=0