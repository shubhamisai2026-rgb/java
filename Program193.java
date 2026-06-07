public class Program193 
{
    public static void main(String[] args)
    {
        String str="shubham";
        
        int len=str.length();
        System.out.println("enter the length: "+len);
       
        for(int i=0;i<str.length();i++)
        {
            
           int iTemp=str.charAt(i);
           char ch=str.charAt(i);
           System.out.println(iTemp+"="+ch);
        }
    }
}
