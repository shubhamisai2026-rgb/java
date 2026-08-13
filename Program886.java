import java.io.*;
public class Program886 
{
    public static void main(String args[])
    {
      try
      {
        File fobj=new File("shubh.txt");
        if(fobj.exists())
        {
            System.out.println("File are present....");
        }
        else
        {
          fobj.createNewFile();
          System.out.println("File successfully created....");
        }
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
