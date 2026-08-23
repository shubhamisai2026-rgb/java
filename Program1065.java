import java.util.*;
public class Program1065
{
    public static void main(String A[])
    {
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);
        aobj.add(51);

        aobj.remove(4);
        aobj.remove(3);

        for(int no : aobj)
        {
            System.out.println(no);
        }

        aobj.clear();

        System.out.println(aobj);
    }
}