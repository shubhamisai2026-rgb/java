import java.util.Scanner;
public class Program293 
{
    public static void display(int Row,int Col)
    {
        int i=0;int j=0;
        for(i=1;i<=Row;i++)
        {
            for(j=1;j<=Col;j++)
            {
              System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int iNo1=0;int iNo2=0;
        System.out.println("enter a number of rows:");
        iNo1=sobj.nextInt();
        System.out.println("enter a number of columns:");
        iNo2=sobj.nextInt();
        display(iNo1,iNo2);
        sobj.close();
    }
}
