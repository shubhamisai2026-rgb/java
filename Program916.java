import java.util.Scanner;
import java.io.*;
public class Program916
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        String foldername=null;

        System.out.println("enter a folder name:");
        foldername=sobj.nextLine();

        File fobj=new File(foldername);

        if((fobj.exists())&&(fobj.isDirectory()))
        {
            System.out.println("folder exists");
        }
        else
        {
            System.out.println("There is no such folder");
        }
        sobj.close();
    }
}
