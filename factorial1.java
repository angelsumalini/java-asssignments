import java.util.*;
class factorial1
{
static int factorial(int f)
{
if(f==0)
{
return 1;
}
else
{
return(f*factorial(f-1));
}
}
public static void main(String args[]){
int i,n=1;
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to find factorial of number");
num=sc.nextInt();
n=factorial(num);
System.out.println("factorial of number is:"+n);
}
}