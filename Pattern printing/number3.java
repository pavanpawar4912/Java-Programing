import java.util.Scanner;
class number3
{
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print");
		rows = s.nextInt();
        for(i=1; i<=rows;i++)
        {
        	for(j=1;j<=i;j++)
        	{
        		System.out.print(i+"");
        	}
        	System.out.println();
        }
	}
}
