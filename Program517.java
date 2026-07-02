public class Program517 
{
    public static void main(String args[])
    {
        Table tobj=new Table();
        tobj.display(5);
    }
}
class Table
{
    public void display(int iNo)
    {
      for(int iCnt=1;iCnt<=10;iCnt++)
      {
         System.out.println(iNo + " * " + iCnt + " = " +iNo*iCnt);
      }
    }
}