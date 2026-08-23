import java.time.LocalDate;

public class Program1071
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();

        StudyLog sobj1 = new StudyLog(lobj,"C Programming",3.5,"Pointers in C");
        StudyLog sobj2 = new StudyLog(lobj,"JAva Programming",5.5,"Inheritance in java");

        System.out.println(sobj1.tostring());
        System.out.println(sobj2.tostring());
    }

}

class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Description;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }
    public String tostring()
    {
        return Date + Subject + Duration +Description;
    }
}

