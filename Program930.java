public class Program930 
{
    public static void main(String args[])
    {
        String header="marvellous";
        System.out.println(header);
        header.replaceAll("l","L"); //Issue
        System.out.println(header);
    }
}
