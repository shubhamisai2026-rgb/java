import java.util.Scanner;
public class Program449 
{
    public static void main(String args[])
    {
       Scanner sobj=new Scanner(System.in);
       String str=null;
       System.out.println("enter a your string:");
       str=sobj.nextLine();
       StringX sobj2=new StringX();
       String Ret=null;
       Ret=sobj2.Upper(str);
       System.out.println("upper string:"+Ret);

       Ret=sobj2.Lower(str);
       System.out.println("lower string:"+Ret);

       Ret=sobj2.Toggle(str);
       System.out.println("toggle string:"+Ret);

       sobj.close();
    }
}
class StringX
{
    public String Upper(String str)
    {
       int i=0;char arr[]={'\0'};
       arr=str.toCharArray();
       for(i=0;i<arr.length;i++)
       {
        if(arr[i]>='a' && arr[i]<='z')
        {
           arr[i]=(char)(arr[i]-32);
        }
       }
       return new String(arr);
    }

    public String Lower(String str)
    {
      int i=0;char arr[]={'\0'};
      arr=str.toCharArray();
      for(i=0;i<arr.length;i++)
      {
        if(arr[i]>='A' && arr[i]<'Z')
        {
            arr[i]=(char)(arr[i]+32);
        }
      }
      return new String(arr);
    }

    public String Toggle(String str)
    {
       int i=0;char arr[]={'\0'};
       arr=str.toCharArray();
       for(i=0;i<arr.length;i++)
       {
        if(arr[i]>='a' && arr[i]<='z')
        {
            arr[i]=(char)(arr[i]-32);
        }
        else if(arr[i]>='A' && arr[i]<='Z')
        {
            arr[i]=(char)(arr[i]+32);
        }
       }
       return new String(arr);
    }
}