import java.util.Scanner;
class Pattern
{
    public void display(int Row,int Col)
    {
        int i=0;int j=0;
        for(i=1;i<=Row;i++)
        {
            for(j=1;j<=Col;j++)
            {
                if(i==j)
                {
                    System.out.print("%\t");
                }
                else if(i>j)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
public class Program319 
{
    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);
       int Row=0;int Col=0;
       System.out.println("enter a number of rows:");
       Row=sobj.nextInt();
       System.out.println("enter a number of column:");
       Col=sobj.nextInt();
       Pattern pobj=new Pattern();
       pobj.display(Row,Col);
       sobj.close();
    }
}
