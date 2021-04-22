class Add2dArray
{
public static void main (String args[])
{

int a[][] = {{5,8},{2,4}};
int b[][] = {{2,4},{6,7}};
int c[][] = new int[2][2];
System.out.println("Addition Of Array Is :");
for(int i=0; i<a.length; i++)
{
for(int j=0; j<b.length; j++ )
{
c[i][j] = a[i][j] + b[i][j];
 System.out.println(c[i][j]);
}
}
}
}