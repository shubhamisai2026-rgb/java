import java.time.LocalDate;
public class Program1072 
{
    public static void main(String args[])
    {
       LocalDate lobj=LocalDate.now();
       StudyLog sobj1=new StudyLog(lobj,"shubham","math",57);
       StudyLog sobj2=new StudyLog(lobj,"nageshwar","chemistry",78);
      sobj1.display();
      sobj2.display();
    }
}
class StudyLog
{
    LocalDate date;
    String student;
    String subject;
    int marks;
    public StudyLog(LocalDate date,String student,String subject,int marks)
    {
        this.date=date;
        this.student=student;
        this.subject=subject;
        this.marks=marks;
    }
    void display()
    {
        System.out.println("date:"+date);
        System.out.println("student:"+student);
        System.out.println("subject:"+subject);
        System.out.println("marks:"+marks);
    }
}