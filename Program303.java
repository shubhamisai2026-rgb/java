import java.util.Scanner;
class Pattern
{
    public void display(int ino1,int ino2)
    {
        int i=0;int j=0;
        char ch='\0';
        for(i=1,ch='A';i<=ino1;i++,ch++)
        {
            for(j=1;j<=ino2;j++)
            {
            System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}
public class Program303 
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
