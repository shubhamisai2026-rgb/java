
public class Program201
{
    public static void main(String[] args) 
    {
        int count=0;
        String str="    shubham  isai is     the \n  king   of  maharashtra   ";
        String str2[]=str.trim().split("\\s+");
        for(int i=0;i<str2.length;i++)
        {
        System.out.println(str2[i]);
        count++;
        }
        System.out.println("total words in the string is: "+count);
    }
}
