import java.io.*;
import java.util.*;
public class Program915 
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        String foldername=null;
        System.out.println("enter a folder name:");
        foldername=sobj.nextLine();

        File fobj=new File(foldername);

        if(fobj.exists())
        {
            System.out.println("folder exists");
        }
        else
        {
            System.out.println("there is no such a folder");
        }
        sobj.close();
    }
}
