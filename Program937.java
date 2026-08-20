import java.util.Scanner;
public class Program937
{
    public static void main(String[] args) {
        
    
    Scanner sobj=new Scanner(System.in);
    String str=null;

    System.out.println("enter string:");
    str=sobj.nextLine();

    System.out.println("String is:"+str+"having length:"+str.length());

    str=str.trim();
     System.out.println("String is:"+str+"having length:"+str.length());

     str=str.replaceAll(" ","");
     System.out.println("String is:"+str+"having length:"+str.length());
     

    sobj.close();
}
}