import  java.io.*;
import java.util.*;

public class Program909
{
    public static void main(String args[]) throws Exception
    {
        String fname=null;
        File fobj=null;
        FileInputStream fobj2=null;

        Scanner sobj=new Scanner(System.in);

        System.out.println("enter file name:");
        fname=sobj.nextLine();

        fobj=new File(fname);

        fobj2=new FileInputStream(fobj);

        byte arr[]=new byte[21];

        if(fobj.exists())
        {
            fobj2.read(arr);
            String str=new String(arr);
            System.out.println(str);
        }
        else
        {
            System.out.println("there is no such file");
        }
        sobj.close();
        fobj2.close();
    }
}
