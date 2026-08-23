import java.util.*;
public class Program1062
{
    public static void main(String A[])
    {
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);
        aobj.add(51);

        System.out.println(aobj.size());
        aobj.add(32);

        System.out.println(aobj.size());
    }
}