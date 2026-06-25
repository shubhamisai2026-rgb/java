import java.util.Scanner;
public class Program436
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        String str=null;
        System.out.println("enter a your string:");
        str=sobj.nextLine();

        Capital cobj=new Capital();
        int Ret=cobj.display(str);
        System.out.println("frequency of capital is: "+Ret);

        Small sobj2=new Small();
        Ret=sobj2.display(str);
        System.out.println("frequency of small is: "+Ret);

        Space sobj3=new Space();
        Ret=sobj3.display(str);
        System.out.println("frequency of the cpace is: "+Ret);

        Digit dobj=new Digit();
        Ret=dobj.display(str);
        System.out.println("frequency of the digits is: "+Ret);

        Special sobj4=new Special();
        Ret=sobj4.display(str);
        System.out.println("frequency of the special is: "+Ret);

        sobj.close();
    }
}