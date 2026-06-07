import java.util.Scanner;
public class Program202 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        String str;
        System.out.println("enter your string:");
        str=sobj.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
        sobj.close();
    }
}
