import java.util.Scanner;
class Pattern
{
    public void display(int ino1,int ino2)
    {
        int i=0;int j=0;
        char ch='\0';
        for(i=1;i<=ino1;i++)
        {
            for(j=1,ch='A';j<=ino2;j++,ch++)
            {
            System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}
public class Program304
{
    public static void main(String args[])
    {
      Scanner sobj=new Scanner(System.in);
      int iVal1=0;int iVal2=0;
      System.out.println("enter a your first number:");
      iVal1=sobj.nextInt();
      System.out.println("enter the second number:");
      iVal2=sobj.nextInt();
      Pattern pobj=new Pattern();
      pobj.display(iVal1,iVal2);
      sobj.close();
    }
}
