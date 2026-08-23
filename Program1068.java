


public class Program1068
{
    public static void main(String A[])
    {
        StudyLog sobj1 = new StudyLog("C",2.5);
        StudyLog sobj2 = new StudyLog("Java",4.5);
            
        System.out.println(sobj1.Subject);
        System.out.println(sobj2.Subject);
    }
}
class StudyLog
{
    public String Subject;
    public double Duration;

    public StudyLog(String a, double d)
    {
        this.Subject = a;
        this.Duration = d;
    }
}