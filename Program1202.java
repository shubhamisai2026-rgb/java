
public class Program1202
{
    public static void main(String A[])
    {
        Demo obj1=new Demo();
        Demo obj2;
        System.out.println(obj1.i);
    } 
}
class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Object created");
        
        this.i = 0;
        this.j = 0;
    }
}
