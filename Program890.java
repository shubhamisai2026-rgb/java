import java.io.*;
import java.util.*;
public class Program890 
{
    public static void main(String args[])
    {
        File fobj=null;
        boolean iRet=false;
        String Fname;
        Scanner sobj=new Scanner(System.in);
        System.out.println("enter a file name:");
        Fname=sobj.nextLine();
        try
        {
            fobj=new File(Fname);
            iRet=fobj.exists();
            if(iRet==true)
            {
                fobj.delete();
                System.out.println("file successfully deleted....");
            }
            else
            {
                System.out.println("there is no this file......");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        sobj.close();
    }
}
