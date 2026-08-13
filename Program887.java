import java.io.*;
public class Program887 
{
    public static void main(String args[])
    {
        try
        {
            File fobj=new File("shubh.txt");
            boolean iRet=false;
            iRet=fobj.exists();
            if(iRet==true)
            {
                System.out.println("File already existed.....");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File created successfully.......");
            }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

