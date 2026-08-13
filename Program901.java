import java.util.Scanner;
import java.io.*;

public class Program901 
{
   public static void main(String args[]) throws IOException
   {
    Scanner sobj=new Scanner(System.in);
    String fname;
    System.out.println("enter a your file name:");
    fname=sobj.nextLine();
    File fobj=new File(fname);
    if(fobj.exists())
    {
      System.out.println("File name:"+fobj.getName());
      System.out.println("Absolute path:"+fobj.getAbsolutePath());
      System.out.println("File Size:"+fobj.length());
    }
    else
    {
        System.out.println("this file not exiist");
    }
     sobj.close();
   } 
}
