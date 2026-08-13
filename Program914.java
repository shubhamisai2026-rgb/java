import java.io.*;
import java.util.*;
public class Program914 
{
    public static void main(String[] args)  throws Exception
    {
        String fnamesrc=null;
        String fnamedest=null;

        int iRet=0;

        File fobjsrc=null;
        File fobjdest=null;

        FileInputStream fobj=null;
        FileOutputStream fobj2=null;

        Scanner sobj=new Scanner(System.in);

        System.out.println("enter a source file name:");
        fnamesrc=sobj.nextLine();

        System.out.println("enter a destination file name:");
        fnamedest=sobj.nextLine();

        fobjsrc=new File(fnamesrc);
        fobjdest=new File(fnamedest);

        fobj=new FileInputStream(fobjsrc);
        fobj2=new FileOutputStream(fobjdest);

        fobjdest.createNewFile();

        byte Buffer[]=new byte[50];

        if(fobjsrc.exists())
        {
         
            while((iRet=fobj.read(Buffer))!=-1)
            {
                fobj2.write(Buffer,0,iRet);
            }
            fobj.close();
            fobj2.close();
        }
        else
        {
            System.out.println("there is no such file");
        }

      sobj.close();
    }
}
