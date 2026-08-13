import java.io.*;

public class Program883 {
    public static void main(String args[]) {
        try 
        {
            File fobj = new File("demo3.txt");
            fobj.createNewFile();
        } 
        catch (IOException i)  // IOException is the subclass of Exception
        {
            System.out.println(i);
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
