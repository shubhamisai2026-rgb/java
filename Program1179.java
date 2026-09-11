public class Program1179
{
    public static void main(String A[])
    {
        String Ans;

        if(A.length != 2)
        {
            System.out.println("Invalid number of arguments");
            return;
        }

        Ans = A[0] + A[1];    // Error

        System.out.println(Ans);

        System.out.println("Addition is : "+(A[0] + A[1]));
    }
}