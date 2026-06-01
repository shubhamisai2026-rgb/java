public class Program80 
{
    public static void main(String[] args)
    {
        int iCnt=0;int count=0;
        System.out.println("total prime numbers are:");
        for(iCnt=2;iCnt<=100;iCnt++)
        {
            count=0;
          for(int i=1;i<=iCnt;i++)
          {
            if(iCnt%i==0)
            {
                count++;
            }
          }
          if(count==2)
          {
            System.out.println(iCnt);
          }
        }
    }
}
