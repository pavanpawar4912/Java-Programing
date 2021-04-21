import java.util.Scanner;
class EvenOdd
{

	public static void main(String[] args)
	 {
	 	int n  ;
	 	Scanner s = new Scanner(System.in);
	 	System.out.println("Enter Any Number");
	 	n = s.nextInt();
	

	 	if (n%2==0) 
	 	{
	 		System.out.println("The Number Is Even");

	 		
	 	}
	 	else
	 	{
	 		System.out.println("The Number Is Odd");
	 	}
		
	}
}