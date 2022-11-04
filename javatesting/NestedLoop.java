class NestedLoop
{
   public static void main(String args[])
   {
         
         for(int i=1;i<=5;i++)
         {
                int x=65;
                for(int j=1;j<=i;j++)
                {
                    if(i%2!=0)
                    System.out.print((char)x);
                    else
                    System.out.print((char)(x+32));
                    x++;
                }
                System.out.println();
          }
   }


}