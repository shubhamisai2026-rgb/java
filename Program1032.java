import java.io.*;
public class Program1032
{
    public static void main(String A[]) throws Exception
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int iSum = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Enter first number : ");
        iNo1 = Integer.parseInt(bobj.readLine());
        System.out.println("Enter second number : ");
        iNo2=Integer.parseInt(bobj.readLine());
        iSum=iNo1+iNo2;
        System.out.println("addition of the twno numbers is:"+iSum);
    }
}