class Employee
{
   static String companyname; //Static Data Member
   int empid;  //Non Static Data Member

   void companyInfo()
   {
       companyname = "ABC";
     
       empid=1001;
       System.out.println("company name is " + companyname);
       System.out.println("empid is " + empid);
         
   }
   public static void main(String args[])
   {
         
          Employee emp = new Employee();
          emp.companyInfo();
          Employee emp1 = new Employee();
          emp1.companyInfo();
         
          

   } 
   



}