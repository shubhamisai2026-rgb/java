import java.io.*;
import java.util.*;
public class Program906 
{
    public static void main(String args[])
    {
        try
        {
        String fname=null;
        File fobj=null;
        FileOutputStream fobj2=null;

        Scanner sobj=new Scanner(System.in);

        System.out.println("enter a file name:");
        fname=sobj.nextLine();

        fobj=new File(fname);

        fobj2=new FileOutputStream(fobj);
        String Data="Marvellous Infosystem";
        byte arr[]=Data.getBytes();

        if(fobj.exists())
        {
            fobj2.write(arr);
        }
        else
        {
            System.out.println("There is not such a file");
        }
        sobj.close();
        fobj2.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
