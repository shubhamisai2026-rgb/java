
import java.util.*;

public class Program986
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        return true;
    }

    public static void main(String A[])
    {
  
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        String str2 = sobj.nextLine();
        
        boolean bRet = false;

        bRet = CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
        sobj.close();
    }
}