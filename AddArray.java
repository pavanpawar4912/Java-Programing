class AddArray
{
public static void main(String args[])
{
int a[] = {1,2};
int b[] = {2,3};
int c[] = new int [a.length]; 

for(int i=0; i<2;i++)
{
c[i] = a[i] + b[i];
 System.out.println("c[] = "+c[i]);
}
}
}