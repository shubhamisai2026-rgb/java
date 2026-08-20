import java.util.*;
public class Program938 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        String str=null;

        System.out.println("enter a string:");
        str=sobj.nextLine();

        System.out.println("String is:"+str+"having length:"+str.length());
        str=str.trim();

        System.out.println("string is:"+str+"having length:"+str.length());

        str=str.replaceAll("\\s+"," ");
        System.out.println("string is:"+str+"having length:"+str.length());

        sobj.close();
        
    }
}
