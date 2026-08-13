import java.io.*;
import java.util.*;
public class Program919
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj=new Scanner(System.in);
        String foldername=null;
 
        System.out.println("enter a folder name:");
        foldername=sobj.nextLine();

        File fobj=new File(foldername);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("folder exists..");
            File arr[]=fobj.listFiles();
            System.out.println("number of files in folder:"+arr.length);

            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i].getName());
                System.out.println(arr[i].length());
            }
        }
        else
        {
            System.out.println("there is no such folder");
        }
        sobj.close();
    }
}
