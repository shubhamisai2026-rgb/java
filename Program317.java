import java.util.Scanner;
class Pattern
{
    public void display(int Row,int Col)
    {
       int i=0;int j=0;int c=0;
       char ch[]=
       {
        'p','r','o','j','e','c','t',' ',' ',' ',' ',' ',
        's','u','c','c','e','s','s','f','u','l','l','y',
        ' ',' ',' ',' ',' ',' ',' ',' ',' ','r','u','n'
       };
       for(i=1;i<=Row;i++)
       {
        for(j=1;j<=Col;j++)
        {
            if(j==1 || j==Col ||i==1 || i==Row)
            {
                System.out.print("@\t");
            }
            else
            {
               System.out.print(ch[c]+"\t");
               c++;
            }
        }
        System.out.println();
       }


    }
}
public class Program317
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        int Row=0;int Col=0;
        System.out.println("enter  the number of rows:");
        Row=sobj.nextInt();
        System.out.println("enter number of columns:");
        Col=sobj.nextInt();
        Pattern pobj=new Pattern();
        pobj.display(Row,Col);
        sobj.close();
    }
}
