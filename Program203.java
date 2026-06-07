import java.util.Scanner;
public class Program203
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        String str;
        System.out.println("enter your string:");
        str=sobj.nextLine();
        String str2[]=str.trim().split("\\s");
        for(int i=(str2.length)-1;i>=0;i--)
        {
            System.out.print(str2[i]+" ");
           
        }
        sobj.close();
    }
}
