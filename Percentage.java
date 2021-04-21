import java.util.Scanner;
class Percentage
{
	public static void main (String args[])
	{
		int per ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Percentage");
		per = s.nextInt();
		if(per < 35)
		{
			System.out.println("Fail");
		}
		else if(per >= 35 && per <= 59 )
		 {
		 	System.out.println("Second Class");
		 }
		 else if(per >=60 && per <=74)
		 {
		 	System.out.println("First Class");
		 }
		 else if(per>= 75 && per<=100 )
		 {
		 	System.out.println("Distinction");
		 }
		 else
		 {
		 	System.out.println("Invalid Output");
		 }
	}

}