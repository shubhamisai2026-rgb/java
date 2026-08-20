import java.util.*;

public class Program943
{
    public static void main(String args[])
    {
        Stringx strobj=new Stringx();
        int iRet=0;

        System.out.println("enter the your string:");
        Scanner sobj=new Scanner(System.in);
        String str=sobj.nextLine();

        iRet=strobj.CountWords(str);
        System.out.println("total words of the string is:"+iRet);

        sobj.close();
    }
}
class Stringx
{
    int CountWords(String str)
    {
        str=str.trim();
        str=str.replaceAll("\\s+"," ");
        String tokens[]=str.split(" ");
        return tokens.length;
    }
}

