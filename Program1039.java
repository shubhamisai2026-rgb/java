import java.io.*;
public class Program1039 
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));
        int iNo=0;
        System.out.println("enter a your number:");
        iNo=Integer.parseInt(bobj.readLine());
        int iDigit=0;int iFact=1;
        int iSum=0;int iTemp=0;
        iTemp=iNo;
        while(iNo!=0)
        {
            iDigit=iNo%10;
             while(iDigit!=0)
             {
                iFact=iFact*iDigit;
                iDigit--;
             }
             iSum=iFact+iSum;
             iFact=1;
             iNo=iNo/10;
        }
        if(iSum==iTemp)
        {
            System.out.println("this is the strong number...");
        }
        else
        {
            System.out.println("this is not the strong number....");
        }
    }
}
