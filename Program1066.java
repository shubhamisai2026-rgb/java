import java.util.*;
public class Program1066
{
    public static void main(String A[])
    {
        ArrayList <String> aobj = new ArrayList <String> ();

        aobj.add("Pune");
        aobj.add("Mumbai");
        aobj.add("Satara");
        aobj.add("Nashik");
        aobj.add("dilli");
        aobj.add("kolhapur");

        aobj.remove(4);
        aobj.remove(2);

        for(String str : aobj)
        {
            System.out.println(str);
        }

        aobj.clear();

        System.out.println(aobj);
    }
}