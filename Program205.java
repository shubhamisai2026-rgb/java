import java.util.Arrays;
public class Program205
{
    public static void main(String[] args) 
    {
        String str1="listen";
        String str2="silent";

        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
        {
          System.out.println("anagrams");
        }
        else
        {
            System.out.println("not anagrams");
        }
    }
}