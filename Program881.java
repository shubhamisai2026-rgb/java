import java.io.*;
class Program881  
{
    public static void main(String[] args) 
    {
      File fobj=new File("Demo2.txt");
      try
      {
      fobj.createNewFile();       // here can come the exception
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
}