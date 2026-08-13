public class Program927 
{
    public static void main(String args[])
    {
        String header="     india is my country        ";
        header.trim(); //ISSUE
        System.out.println(header.length());
    }
}
