public class Program531 
{
    public static void main(String args[])
    {
       Perfect pobj=new Perfect();
       pobj.display(28);
    }
}
class Perfect
{
    public void display(int num)
    {
        int iSum=0;
      for(int i=1;i<=(num/2);i++)
      {
        if(num%i==0)
        {
            iSum=iSum+i;
        }
      }
      if(iSum==num)
      {
        System.out.println("number is a perfect...");
      }
      else
      {
        System.out.println("number is not a perfect...");
      }
    }
}
