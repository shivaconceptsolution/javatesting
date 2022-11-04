class Breakcontinue
{
   public static void main(String args[])
   {  
         int sal=21000;
         for(int i=101;i<=110;i++)
         {
            
                if( i==103 || i==105 || i==107)
                   continue;
                if(sal>=20000 && i==108)
                   break; 
                System.out.println("Empid "+ i + " Salary is "+sal);

         }

      
   }
   

}