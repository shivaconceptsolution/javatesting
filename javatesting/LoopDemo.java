class LoopDemo
{
   public static void main(String args[]) throws InterruptedException
   {
        for(int i=1;i<=10;i++)
        {
            if(i<=5)
            System.out.println(i);
            else
            System.out.println(11-i);
            Thread.sleep(1000);
        }

   }


}