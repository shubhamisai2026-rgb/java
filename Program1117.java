import java.util.*;

public class Program1117
{
    public static void main(String A[])
    {
        Integer Arr[] = {10,13,34,21,15,7,24};

        for(int no : Arr)
        {
            System.out.print(no+"\t");
        }

        System.out.println();

        Arrays.sort(Arr,Collections.reverseOrder());
        
        for(int no : Arr)
        {
            System.out.print(no+"\t");
        }

        System.out.println();
    }
}