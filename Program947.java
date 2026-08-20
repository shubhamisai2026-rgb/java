

import java.util.*;

public class Program947
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

        strobj.DisplayWords(str);
        strobj.LargestWord(str);

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

    void DisplayWords(String str)
    {
        str=str.trim();
        str=str.replaceAll("\\s+"," ");
        String tokens[]=str.split(" ");
        
        for(int i=0;i<tokens.length;i++)
        {
            System.out.println(tokens[i]+":"+tokens[i].length());
        }
    }

    void LargestWord(String str)
    {
        int iMax=0;
        String temp=null;
        str=str.trim();
        str=str.replaceAll("\\s+"," ");
        String tokens[]=str.split(" ");
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].length()>iMax)
            {
               iMax=tokens[i].length();
               temp=tokens[i];
            }
        }
        System.out.println("Largest word length is:"+iMax);
        System.out.println("Largest wrord is:"+temp);
    }
}

