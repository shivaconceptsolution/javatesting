package scs;

public class Student {
       int rno;
       String name;
       void accept(int rno,String name)
       {
    	  this.rno = rno;
    	  this.name=name;
       }
       void display()
       {
    	   System.out.println("rno is "+rno+ " name is "+name);
       }
	
       public static void main(String args[])
       {
    	   Student obj = new Student();  //dynamic memory 
    	   obj.accept(1001,"XYZ");
    	   obj.display();
    	   Student obj1 = new Student();  //dynamic memory 
    	   obj1.accept(1002,"MNO");
    	   obj1.display();
       }
}
