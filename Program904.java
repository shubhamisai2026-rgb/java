public class Program904 
{
    public static void main(String args[])
    {
        String Data="Marvellous Infosystem";
        byte brr[]=Data.getBytes();
        System.out.println(Data.length());
        System.out.println(brr.length);
        
        for(int i=0;i<brr.length;i++)
        {
          System.out.print(brr[i]);
        }
    }
}
