import java.io.*;

public class Program1059
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
     
        int iSquare = 0;
       

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());


        iSquare = iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 != iSquare % 10)
            {
                break;
            }
            iNo = iNo / 10;
            iSquare = iSquare / 10;
        }

        if(iNo == 0)
        {
            System.out.println("It is automorphic number");
        }
        else
        {
            System.out.println("It is not automorphic number");
        }
    }
}