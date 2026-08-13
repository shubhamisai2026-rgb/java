import java.io.*;
import java.util.*;

public class Program924 
{
    public static void main(String args[]) throws Exception
    {
      int iRet=0;
      Scanner sobj=new Scanner(System.in);
      String foldername=null;
      String packfilename=null;

      FileOutputStream foobj=null;
      FileInputStream fiobj=null;

      System.out.println("enter a folder name:");
      foldername=sobj.nextLine();

      System.out.println("enter the name of packed file:");
      packfilename=sobj.nextLine();

      File fobjfolder=new File(foldername);

      if(fobjfolder.exists() && fobjfolder.isDirectory())
      {
        System.out.println("folder exists");
        File fobjpack=new File(packfilename);
        fobjpack.createNewFile();

        foobj=new FileOutputStream(packfilename);

        File arr[]=fobjfolder.listFiles();

        System.out.println("number os files in folder:"+arr.length);
        byte Buffer[]=new byte[1024];

        for(int i=0;i<arr.length;i++)
        {
            fiobj=new FileInputStream(arr[i]);
            System.out.println(arr[i].getName());
            // write file name and size
            //loop to read from fiobj & write foobj

            while((iRet=fiobj.read(Buffer))!=-1)
            {
                foobj.write(Buffer,0,iRet);
            }
            fiobj.close();
        }
        foobj.close();
      }
      else
      {
      System.out.println("there is no such a folder...");
      }
        
        sobj.close();
    }
}
