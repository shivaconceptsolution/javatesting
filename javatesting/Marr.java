class Marr
{
    public static void main(String args[])
    {
         int x[][] = {{2,3},{4,5}};
         int y[][] = {{5,6},{7,8}};

         for(int i=0;i<2;i++)
         {
                 int s=0;
                 for(int j=0;j<2;j++)
                  { 
                        s = x[i][j] + y[i][j];
                        System.out.print(s + " ");
                  }
                  System.out.println();
                   
           }

     }


}