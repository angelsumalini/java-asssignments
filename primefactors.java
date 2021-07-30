import java.util.Scanner;

class primefactors
{
public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number to find prime factors ");   
int number=sc.nextInt();
System.out.println("Given Number is : " + number);
System.out.print("prime factors are : " );
        for (int i = 2; i <= number; i++) {
 
            while (number % i == 0){
                System.out.print(i + " ");
                number = number / i;
            }
          }
 
        if (number < 1) 
           System.out.println(number);
    }
 }