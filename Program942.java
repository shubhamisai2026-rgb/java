public class Program942 
{
    public static void main(String args[])
    {
        String header="india is my country";
        header=header.trim();
        header=header.replaceAll("\\s+"," ");
        String arr[]=header.split(" ");
        System.out.println("Number of words are:"+arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
