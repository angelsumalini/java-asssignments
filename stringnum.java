import java.util.*;
class stringnum
{
public static void main(String args[])
{
String s1=" ",s2=" ";
Scanner sc=new Scanner(System.in);
String st=sc.next();
int n=st.length();
for(int i=0;i<n;i++)
{
if(i%2==0)
s1=s1+st.charAt(i);
else
s2=s2+st.charAt(i);
}
System.out.println(s1+" "+s2);
}
}