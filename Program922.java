import java.io.*;
import java.util.*;

public class Program922 
{
  public static void main(String args[]) throws Exception
  {
    Scanner sobj=new Scanner(System.in);
    String foldername=null;
    String packfilename=null;

    FileInputStream fiobj=null;
    FileOutputStream foobj=null;

    System.out.println("enter a folder name:");
    foldername=sobj.nextLine();

    System.out.println("enter the name of packed file:");
    packfilename=sobj.nextLine();

    File fobjfolder=new File(foldername);

    if(fobjfolder.exists() && fobjfolder.isDirectory())
    {
        System.out.println("folder exists");
        File fobjpack=new File(packfilename);

        fobjpack.createNewFile(); //pack file gets created
        foobj=new FileOutputStream(fobjpack);

        File arr[]=fobjfolder.listFiles();

        System.out.println("number of files in a folder..."+arr.length);

        for(int i=0;i<arr.length;i++)
        {
            fiobj=new FileInputStream(arr[i]);

            //write file name and size
            //loop to read from fiobj & write to foobj
        }
    }
    else
    {
        System.out.println("there is no such folder");
    }
    sobj.close();
    fiobj.close();
    foobj.close();
  }  
}
