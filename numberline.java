import java.util.*;
class numberline
{
public static void main(String args[])
{
int i,j,k;
int rows=6;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
for(i=1;i<=n;++i)
{
for(j=1;j<=i;j++)
{
System.out.print("");
}
for(k=1;k<=i;k++)
{
System.out.print(k+" ");
}
System.out.println();
}
return;
}
}