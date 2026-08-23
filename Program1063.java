import java.util.*;
public class Program1063
{
    public static void main(String A[])
    {
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);
        aobj.add(51);
        aobj.add(34);

        for(int i = 0; i < aobj.size(); i++)
        {
            System.out.println(aobj.get(i));
        }
    }
}