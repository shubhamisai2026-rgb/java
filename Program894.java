import java.io.*;
public class Program894 
{
 public static void main(String args[])
 {
    FileWriter fobj=null;
    try
    {
        fobj=new FileWriter("shubh.txt");
        fobj.write("shubham isai is the aspiring software developer...");
        fobj.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    finally
    {
        
    }
 }    
}
