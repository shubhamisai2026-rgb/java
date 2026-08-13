import java.io.FileReader;

public class Program899 
{
 public static void main(String args[]) 
 {
    try
    {
    FileReader fobj=new FileReader("shubh.txt");
    char Buffer[]=new char[1024];
     fobj.read(Buffer,2,60);
     System.out.println(Buffer);
     fobj.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

 }  

}
