import java.io.*;
public class Program893 
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fobj=new FileWriter("shubh.txt");
            fobj.write("jay Mahadev...");
            fobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
