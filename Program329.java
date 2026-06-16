import java.util.Scanner;
class Pattern
{
    public void display(int Row,int Col)
    {
      int i=0;int j=0;char ch='\0';
      if(Row!=Col)
      {
        System.out.println("invalid parameter...");
        System.out.println("Row and column should be the same...");
        return;
      }
      for(i=1,ch='a';i<=Row;i++)
      {
        for(j=1;j<=i;j++,ch++)
        {
           System.out.print(ch+"\t");
        }
        System.out.println();
      }
    }
}
public class Program329 
{
    public static void main(String args[])
    {
      int Row=0;int Col=0;
      Scanner sobj=new Scanner(System.in);
      System.out.println("enter a number of rows:");
      Row=sobj.nextInt();
      System.out.println("enter a number of columns:");
      Col=sobj.nextInt();
      Pattern pobj=new Pattern();
      pobj.display(Row,Col);
      sobj.close();
    }
}
