import java.util.*;

class Matrix
{
    public int Arr[][]; int i,j;int iRow;int iCol;

    Scanner sobj=new Scanner(System.in);

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside Matrix Constructor");

        Arr = new int[iRow][iCol];
    }

    public void display()
    {
               System.out.println("Enter the elements of matrix");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
        
       Arr = null;
       System.gc(); 
    }
}
public class Program1021
{
    public static void main(String A[])
    {        
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;


        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of coluns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);
        mobj.display();


        sobj.close();
        mobj = null;

        System.gc();
        
      
    }

}