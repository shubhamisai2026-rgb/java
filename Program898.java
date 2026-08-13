import java.io.FileReader;

public class Program898 
{
public static void main(String[] args)
{
   FileReader fobj=null;
   char Buffer[]=new char[60];
   try
   {
    fobj=new FileReader("shubh.txt");
    fobj.read(Buffer);
    System.out.println(Buffer);
    fobj.close();
   }  
   catch(Exception e)
   {
    System.out.println(e);
   }
}    
}
