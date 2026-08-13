import java.io.*;
import java.util.*;
public class Program920 
{
    public static void main(String args[]) throws Exception
    {
      Scanner sobj=new Scanner(System.in);
      String foldername=null;
      String packfilename=null;

      System.out.println("enter the folder name:");
      foldername=sobj.nextLine();

      System.out.println("enter the packed file name:");
      packfilename=sobj.nextLine();

      File fobj=new File(foldername);

      if(fobj.exists() && fobj.isDirectory())
      {
        System.out.println("folder exists");
        File fobj2=new File(packfilename);
        fobj2.createNewFile();  //pack file fets created

        File arr[]=fobj.listFiles();
        System.out.println("number of files in folder:"+arr.length);

        for(int i=0;i<arr.length;i++)
        {
           //logic
        }
      }
      else
      {
        System.out.println("there is no such a folder");
      }
      sobj.close();
    }
}
