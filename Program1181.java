import java.util.*;

public class Program1181
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid number of arguments");
            return;
        }

        String str = A[0];

        TreeMap <Character,Integer> frequency = new TreeMap<Character,Integer>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println(frequency);

        // Issue in ordering
    }
}