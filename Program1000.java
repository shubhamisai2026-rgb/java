import java.util.*;
public class Program1000
{
    public static void main(String A[])
    {
        HashMap <Character , Integer> hobj = new HashMap<Character , Integer>();

        hobj.put('a', 1);
        hobj.put('b', 1);
        hobj.put('a', 2);
        hobj.put('b', 2);
        hobj.put('c',3);
        

        System.out.println(hobj.containsKey('b'));
        System.out.println(hobj.containsKey('c'));
    }
}