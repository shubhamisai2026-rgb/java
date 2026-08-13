import java.io.*;
import java.util.*;
public class Program921 
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);
        String foldername=null;
        String packfilename=null;
        
        FileInputStream fobj=null;
        FileOutputStream fobj2=null;

        System.out.println("enter a folder name:");
        foldername=sobj.nextLine();

        System.out.println("enter the name of packed file:");
        packfilename=sobj.nextLine();

        File fobj3=new File(foldername);

        if(fobj3.exists() && fobj3.isDirectory())
        {
            System.out.println("folder exists...");
            File fobj4=new File(packfilename);
            fobj4.createNewFile();    // Pack files get created

            fobj2=new FileOutputStream(packfilename);

            File arr[]=fobj3.listFiles();

            System.out.println("number of files in folder:"+arr.length);

            for(int i=0;i<arr.length;i++)
            {
                fobj=new FileInputStream(arr[i]);

                //loop to read from fobj & write to fobj2
            }
        }
            else
            {
                System.out.println("there is no such a folder");
            }
        sobj.close();
        fobj.close();
        fobj2.close();
    }
}
