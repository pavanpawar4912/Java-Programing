import java.util.Scanner;
class number4
{
   public static void main(String args[])
    {
       int i,j,row;
       Scanner s= new Scanner(System.in);
       System.out.println("Enter The Row You Print");
       row =s.nextInt();
       for(i=row; i>=1; i--)
          {
             for(j=row; j>=1; j--)
                {
                  System.out.print(j+"");
                }
             System.out.println();
          }
    }
}