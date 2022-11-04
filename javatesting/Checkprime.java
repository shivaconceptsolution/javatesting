class Reverse
{
   public static void main(String args[])
   {
       int num=12345;
       String s = "";
       while(num!=0)   //0!=0
       {
           s = s + num%10;  //54321
           num = num/10;    //0

       }

      System.out.println(s);


   }



}