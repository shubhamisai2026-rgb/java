import java.io.*;
public class Program896
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader frobj=new FileReader("shubh.txt");
            System.out.println((char)frobj.read());
              frobj.close();
       
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
          
        }
    }
}
