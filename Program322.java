import java.util.Scanner;

class Pattern 
{
    public void display(int Row, int Col) 
    {
        int i = 0;
        int j = 0;
        int c = 0;

        System.out.println("#BABA...!,#MARVELLOUS INFOSYSTEM,#MARVELLOUS TEAM,#SPRINGBOOT,");
        System.out.println("HELLO SIR,");
        System.out.println();
        char ch[] = 
        {
                80, 82, 74, 69, 67, 84, ' ', ' ', ' ', ' ', ' ', ' ',
                83, 85, 67, 67, 69, 83, 83, 70, 85, 76, 76, 89,
                ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 82, 85, 78
        };
        for (i = 1; i <= Row; i++) 
        {
            for (j = 1; j <= Col; j++) 
                {
                if (j == 1 || j == Col || i == 1 || i == Row) 
                    {
                    System.out.print("@\t");
                    }
                else 
                    {
                    System.out.print(ch[c] + "\t");
                    c++;
                    }
                }
                System.out.println();
        }

    }
}

public class Program322 
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int Row = 0;
        int Col = 0;
        System.out.println("enter  the number of rows:");
        Row = sobj.nextInt();
        System.out.println("enter number of columns:");
        Col = sobj.nextInt();
        System.out.println();
        Pattern pobj = new Pattern();
        pobj.display(Row, Col);
        sobj.close();
    }
}
