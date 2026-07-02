public class Program518 
{
    public static void main(String args[])
     {
        Prime pobj = new Prime();
        pobj.display(5);
    }
}

class Prime
 {
    public void display(int iNo)
     {
        int i = 0;
        for (i = 2; i <= iNo / 2; i++) 
        {
            if(iNo%i==0)
            {
                System.out.println("number is not prime..");
                return;
            }
        }
        System.out.println("the number is a prime...");
    }
}