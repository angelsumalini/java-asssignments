import java.util.*;
import java.util.Scanner;
class R
{
public static void main(String args[])
{
ArrayList<Integer> a1=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int k=sc.nextInt();
System.out.println("Enter values into arraylist");
for(int i=0;i<k;i++)
{
int n=sc.nextInt();
a1.add(n);
}
System.out.println(a1);
System.out.println("Enter k value ");
int m=sc.nextInt();
Iterator<Integer> x=a1.iterator();
while(x.hasNext())
{
if(x.next()<m+1)
{
x.remove();
}
}
for(int t=0;t<a1.size();t++)
{
System.out.print(a1.get(t)+" ");
}
}
}