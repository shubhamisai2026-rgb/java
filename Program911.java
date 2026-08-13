import java.io.*;
import java.util.*;
public class Program911 
{
    public static void main(String args[]) throws Exception
    {
       String fname=null;
      
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
          int iRet=0;
         while((iRet=fobj2.read(Buffer))!=-1)
         {
            str=new String(Buffer);
            System.out.println(str);
            str=null;
            System.out.println("length of the string is:"+iRet);
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
