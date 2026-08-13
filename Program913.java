import java.io.*;
import java.util.*;

public class Program913 
{
    public static void main(String args[]) throws IOException
    {
        String fname=null;
        int iRet=0;
        File fobj=null;
        FileInputStream fobj2=null;

        Scanner sobj=new Scanner(System.in);

        System.out.println("enter a file name:");
        fname=sobj.nextLine();

        fobj=new File(fname);

        fobj2=new FileInputStream(fobj);

        byte Buffer[]=new byte[40];

        if(fobj.exists())
        {
            String str=null;
            while((iRet=fobj2.read(Buffer))!=-1)
            {
                str=new String(Buffer,0,iRet);  // IMP
                System.out.print(str);
                str=null;
            }
        }
        else
        {
            System.out.println("there is no such file");
        }
        sobj.close();
        fobj2.close();
    }
}
