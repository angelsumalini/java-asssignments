import java.util.*;
import java.util.Scanner;
class primefactor1
{
public static void main(String args[])
 {
Scanner in=new Scanner(System.in);
int n,i,j,sum=0,k=0;
System.out.println("enter no of numbers "); 
n = in.nextInt();  
for(i=2;i<=n;i++)
{
if(n%i==0)
{
for(j=2;j<=i;j++)
{
if(i%j==0)
{
k++;
}
}
if(k==1)
{
sum=sum+i;
}
}
k=0;
}
System.out.println("prime number:"+n);
System.out.println("sum of prime factors :"+sum);
}
}