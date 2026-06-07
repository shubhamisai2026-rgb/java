import java.util.Scanner;
public class Program183 
{
    public static void main(String[] args) 
    {
        int iNo=0;int iDigit=0;int iEven=0;int iOdd=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter a your number:");
        iNo=sobj.nextInt();
        while(iNo!=0)
        {
           iDigit=iNo%10;
           if(iDigit%2==0)
           {
            iEven++;
           }
           else
           {
            iOdd++;
           }
           iNo=iNo/10;
        }
        System.err.println("even digits: "+iEven);
        System.out.println("odd digits: "+iOdd);
        sobj.close();
    }
}
