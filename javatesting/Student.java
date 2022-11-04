class Student
{
    
    static void collegeInfo(String collegename)
    {
             
               System.out.println(collegename);
    }
    void stuInfo(String sname)
    {
               
               System.out.println(sname);
    }
    public static void main(String args[])
    {
        Student.collegeInfo("ABCD");
        Student obj = new Student();
        obj.stuInfo("Ravi Kumar");
    }
}