public class Program192 
{
    public static void main(String[] args) 
    {
        String str="madam";int i=0;
        String rev="";
        for(i=str.length()-1;i>=0;i--)
        {
           rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("string is palindrome....");
        }
        else
        {
            System.out.println("string is not a palindrome.....");
        }
    }
}
