import java.util.*;
import java.time.LocalDate;

public class Program1079
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();

        ArrayList <StudyLog> Database = new ArrayList<StudyLog>();

        StudyLog sobj1 = new StudyLog(lobj,"C Programming",3.5,"Pointers in C");
        StudyLog sobj2 = new StudyLog(lobj,"C++ Programming",3.5,"Pointers in C");
        StudyLog sobj3 = new StudyLog(lobj,"Java Programming",3.5,"Pointers in C");
        StudyLog sobj4 = new StudyLog(lobj,"python programming",4.5,"pointers in c++");

        Database.add(sobj1);
        Database.add(sobj2);
        Database.add(sobj3);
        Database.add(sobj4);

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }

        Database.remove(1);
        Database.remove(2);

        System.out.println("After removal");

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }
    }
}

class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }
}
