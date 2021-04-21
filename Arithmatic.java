import java.util.Scanner;
class Arithmatic
{
	public static void main( String args[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number");
		a = s.nextInt();
		System.out.println("Enter Second Number");
		b = s.nextInt();
		System.out.println("a+b" : +(a+b));
		System.out.println("a-b" :+(a-b));
		System.out.println("a*b" :+(a*b));
		System.out.println("a/b" :+(a/b));
	}
}