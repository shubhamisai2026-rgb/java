
public class Program903 
{
    public static void main(String args[])
    {
        String header="   shubham   isai   the aspiring    software developer        ";
        System.out.println(header.length());
        header=header.trim();
        System.out.println(header.length());
        header=header.replaceAll(" ","");
        System.out.println(header.length());

        Program pobj=new Program();
        pobj.display();
    }
}
class Program
{
    void display()
    {
    String Data="Marvellous Infosystem";
    byte arr[]=Data.getBytes();
    System.out.println(Data.length());
    System.out.println(arr.length);
    }
}
