import java.util.Scanner;
class Pattern
{
    public void display(int Row,int Col)
    {
        int i=0;int j=0;
        for(i=1;i<=Row;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1 || i==j || i==Row)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
public class Program331 
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
