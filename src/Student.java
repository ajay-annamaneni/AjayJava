public class Student
{
    String name;
    String grade;
    public Student(String name, String grade)
    {
        this.name=name;
        this.grade=grade;
    }
    // public void displayInfo()
    public String toString()
    {
        return name+" "+grade;
    }
}