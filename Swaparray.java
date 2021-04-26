class Swaparray
{
public static void main(String args[])
{
int a[] = {20,40};
int b[] = {30,40};
int c[] = new int [2],i;
System.out.println("Before Swapping Array =>");
for( i = 0; i<a.length ; i++)
{
System.out.println("a ="+a[i]);
}
for(i = 0; i<b.length ; i++)
{
System.out.println("b =" +b[i]);
}
System.out.println("After Swapping Arrays =>");
for(i = 0; i<a.length; i++)
{
  c[i] = a[i];
  a[i] = b[i];
  b[i] = c[i];
  System.out.println("a=>"+a[i]);
}
for(i = 0; i<=b.length; i++)
{
System.out.println("b =" +b[i]);
}
}
}