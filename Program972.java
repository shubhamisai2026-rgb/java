import java.util.*;

// Inuput : my name is shubham
// Output : My Name Is Shubham

// Inuput : my NAME is ShuBHAm
// Output : My Name Is Shubham


public class Program972
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                if(Arr[i+1] >= 'a' && Arr[i+1] <= 'z')
                {
                    Arr[i+1] = (char)(Arr[i+1] - 32);
                }
            }
        }

        String output = new String(Arr);
        
        System.out.println("Updated string is : "+output);

        sobj.close();
    }
}