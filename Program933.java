public class Program933 
{
    public static void main(String args[]) 
    {
        String str = "    india   is   the   my   country     ";
        System.out.println(str.length());
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll(" ", "");
        System.out.println(str);
        System.out.println(str.length());
    }
}
