import java.util.Scanner;

public class Program420 
{
  public static void main(String args[]) 
  {
    String str = null;
    Scanner sobj = new Scanner(System.in);
    System.out.println("enter the your string:");
    str = sobj.nextLine();
    System.out.println("the string is:" + str);
    sobj.close();
  }
}