import java.util.Scanner;
class Stu
{
   int rno;
   String name;
   String branch;
   int fees;
   void stuInfo(int rno,String name,String branch,int fees)
   {
        this.rno=rno;
        this.name=name;
        this.branch=branch;
        this.fees=fees;
   }
   void display()
   {
      System.out.println("rno is "+rno);
      System.out.println("name is "+name);
      System.out.println("branch is "+branch);
      System.out.println("fees is "+fees);
   }
   public static void main(String args[])
   {
      Scanner sc  = new Scanner(System.in);
      int size;
      System.out.println("Enter no of students");
      size = sc.nextInt();
      Stu s1[] = new Stu[size];
      int totalfee=0;
      for(int i=0;i<size;i++)
      {
      s1[i] = new Stu();
      System.out.println("Enter rno");
      int rno = sc.nextInt();
      System.out.println("Enter name");
      String name = sc.next();
      System.out.println("Enter branch");
      String branch = sc.next();
      System.out.println("Enter fees");
      int fee = sc.nextInt();
      s1[i].stuInfo(rno,name,branch,fee);
      }
      for(int i=0;i<size;i++)
      { 
      totalfee = totalfee + s1[i].fees;
      s1[i].display();
      
      }
     
      System.out.println("Total fees of student is " + totalfee);
     
   }
}