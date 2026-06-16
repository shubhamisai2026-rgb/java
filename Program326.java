import java.util.Scanner;
class Pattern
{
    public void display(int Row,int Col)
    {
        int i=0;int j=0;
        if(Row!=Col)
        {
            System.out.println("rows and column are mismatch...");
            System.out.println("row and column should be the same...");
            return;
        }
        for(i=1;i<=Row;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
public class Program326 
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
