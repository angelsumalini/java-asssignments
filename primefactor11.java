import java.util.Scanner;
class primefactor11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number to find prime factors ");   
int n=sc.nextInt();
System.out.println("Given Number is : "+ n);
System.out.print("prime factors are : " );
for (int i=2; i<=n;i++) 
{
while (n%i==0){
System.out.print(i+" ");
n=n/i;
}
}
}
}