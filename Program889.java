import java.io.*;
public class Program889
{
    public static void main(String args[])
    {
         File fobj=null;
         boolean iRet=false;

      try
      {
        fobj=new File("shubh4.txt");
        iRet=fobj.exists();
        if(iRet==true)
        {
            fobj.delete();
            System.out.println("File deleted succssfully....");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("File successfully created...");
        }
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
}
