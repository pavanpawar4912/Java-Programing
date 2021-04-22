import java.util.Scanner;
public class Arrayin
{
  public static void main(String args[])
 {
  int i,n;
 Scanner s = new Scanner(System.in);
  System.out.println("Enter the reqiured number of array element");
  n = s.nextInt();
  int a[] = new int[n];
  System.out.println("Enter The Array Element");
   for(i=0; i<n; i++)
    {
      a[i] = s.nextInt();
    }
   System.out.println("The Array Element You Have Entered Are :");
    for(i=0; i<n; i++)
     {
        System.out.println(a[i] );

      }
  }
}