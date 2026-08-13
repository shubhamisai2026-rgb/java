import java.io.*;
public class Program888 
{
    public static void main(String args[])
    {
        File fobj=null;
        boolean iRet=false;
        try
        {
            fobj=new File("shubh3.txt");
            iRet=fobj.exists();
            if(iRet==true)
            {
              System.out.println("File already existed......");
            } 
            else
            {
                fobj.createNewFile();
                System.out.println("File created successfully....");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
