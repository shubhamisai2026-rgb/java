import java.io.FileReader;


public class Program897 
{
    public static void main(String[] args) 
    {
      try
      {
       FileReader fobj=new FileReader("shubh.txt");
        int iRet=0;
        while((iRet=(fobj.read()))!=-1)
        {
            System.out.print((char)iRet);
        }
        fobj.close();
      }   
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
}
