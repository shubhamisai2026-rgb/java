import java.io.*;
import java.util.*;
public class Program912 
{
    public static void main(String srgs[]) throws IOException
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

        byte Buffer[]=new byte[50];

        if(fobj.exists())
        {
            String str=null;
            while((iRet=fobj2.read(Buffer))!=-1)
            {
                System.out.println(iRet);
                str=new String(Buffer);
                System.out.println(str);
                str=null;
            }
        }
        else
        {
            System.out.println("there is not such a file");
        }
        sobj.close();
        fobj2.close();
    }
}
