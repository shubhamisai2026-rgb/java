import java.util.*;

public class Program1190
{
    public static void main(String A[])
    {
        String transactions[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashSet <String> unique = new HashSet<String>();
        HashSet <String> duplicate = new HashSet<String>();

        System.out.println("unique values of string:");
        for(String str : transactions)
        {
            if(unique.add(str))
            {
                System.out.println(str);
            }
            else
            {
                duplicate.add(str);
            }
        }

        System.out.println("Duplicate transactions : ");
        for(String str : duplicate)
        {
            System.out.println(str);
        }
    }
}