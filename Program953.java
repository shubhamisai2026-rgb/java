import java.io.*;
import java.util.*;
public class Program953 
{
   public static void main(String args[]) throws Exception
   {
     // int iRet=0;

      Scanner sobj=new Scanner(System.in);
      String foldername=null;
      String packfilename=null;
     // String header=null;

      FileOutputStream foobj=null;
      FileInputStream fiobj=null;

      System.out.println("enter a folder name:");
      foldername=sobj.nextLine();

      System.out.println("enter the packfile name:");
      packfilename=sobj.nextLine();

      File fobjfolder=new File(foldername);

      if((fobjfolder.exists())&&(fobjfolder.isDirectory()))
      {
        System.out.println("folder exists...");
        File fobjpack=new File(packfilename);

        fobjpack.createNewFile(); //pack file gets created

        foobj=new FileOutputStream(fobjpack);

        File farr[]=fobjfolder.listFiles();
        System.out.println("number os files in folder:"+farr.length);

       //  byte Buffer[]=new byte[1024];

        for(int i=0;i<farr.length;i++)
        {
            fiobj=new FileInputStream(farr[i]);

            System.out.println(farr[i].getName());
            System.out.println(farr[i].length());

            //write file name and size
            /*
            Loop to read from fiobj & write to foobj
            while((iRet=fiobj.read(Buffer))!=-1)
            {
              foobj.write(Buffer,0,iRet);
            }
            */
           fiobj.close();
        }
           foobj.close();
           sobj.close();
        }
        else
        {
          System.out.println("there is no such folder");
        }
      }


    
}
