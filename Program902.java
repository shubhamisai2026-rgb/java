import java.util.*;
import java.io.*;
public class Program902 
{
    public static void main(String args[]) throws IOException
    {
        Scanner sobj=new Scanner(System.in);
        String fname=null;
        System.out.println("enter the file name:");
        fname=sobj.nextLine();
        File fobj=new File(fname);
        FileOutputStream fobj3=new FileOutputStream(fobj);
        String data="Marvellous infosystem";
        if(fobj.exists())
        {
            fobj3.write(data.getBytes());
        }
        else
        {
            System.out.println("file not present...");
        }
        sobj.close();
        fobj3.close();
    }
}
