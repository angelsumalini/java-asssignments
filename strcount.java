import java.util.*;
class strcount
{
public static void main(String args[])
{
String str;
Scanner up=new Scanner(System.in);
System.out.println("Enter string");
str=up.next();
int u=0,l=0,d=0,s=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(Character.isUpperCase(ch[i]))
u++;
else if(Character.isLowerCase(ch[i]))
l++;
else if(Character.isDigit(ch[i]))
d++;
else
s++;
}
System.out.println("\n"+u+"\n"+l+"\n"+d+"\n"+s);
if(u==l && d==s)
{
System.out.println("Yes");
}
else
{
System.out.println("NO");
}
}
}