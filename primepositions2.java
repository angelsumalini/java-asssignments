import java.util.*;
import java.util.Scanner;
class  primepositions
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n=100000; 
ArrayList<Integer> x=new ArrayList<Integer>();
int prime[]=new int[n+1]; 
for(i=0;i<=n;i++)  
prime[i]=1;  
prime[1]=0; 
for(int p=2;p*p<=n;p++) 
{ 
if(prime[p]==1) 
for(i=p*p;i<=n;i=i+p) 
{ 
if(prime[i]==1) 
prime[i]=0; 
}
}  
int start,end; 
System.out.print("Starting range:"); 
start=sc.nextInt(); 
System.out.print("Ending range:"); 
end=sc.nextInt(); 
for(int j=start;j<=end;j++) 
{ 
if(prime[j]==1) 
x.add(j);	
}
try
{
System.out.print("Values in even positions: ");
for(int k=1;k<=x.size();k+=2)
System.out.print(x.get(k)+" ");
}
catch(IndexOutOfBoundsException e){}
}
}