import java.util.*;
public class Program999
{
    public static void main(String A[])
    {
        HashMap <Character , Integer> hobj = new HashMap<Character , Integer>();

        hobj.put('a', 1);
        hobj.put('b', 1);
        hobj.put('a', 2); //overwrite
        hobj.put('b', 2); //overwrite
        
        System.out.println(hobj.keySet());
    }
}