import java.util.Scanner;
public class Program287 
{
   
    public static void display(int iNo)
    {
        Scanner sobj=new Scanner(System.in);
        int iCnt=0;
        char ch[]=new char[iNo];
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
          ch[iCnt]=sobj.next().charAt(0);
        }
          for(iCnt=0;iCnt<iNo;iCnt++)
          {
          if(ch[iCnt]=='S' || ch[iCnt]=='H' || ch[iCnt]=='U' || ch[iCnt]=='B' || ch[iCnt]=='H'
           || ch[iCnt]=='A' || ch[iCnt]=='M')
           {
            System.out.print(ch[iCnt]);
           }
        }
        sobj.close();
    }
    public static void main(String args[])
    {
        int iValue=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter a your value:");
        iValue=sobj.nextInt();
        display(iValue);
        sobj.close();
    }
    
}
