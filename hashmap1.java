import java.util.*;
class hashmap1
{
public static void main(String args[])
{
int x=0,y=0;
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
Integer a[]={12,5,10,20,9,3,6,7,8,11};
for(int i=0;i<a.length;i++)
{
if(hm.containsKey(a[i]))
hm.put(a[i],hm.get(a[i])+1);
else
hm.put(a[i],1);
}
for (Map.Entry<Integer,Integer>i:hm.entrySet())
{
if(i.getKey()%5==0)
x=x+1;
else if(i.getKey()%3==0)
y=y+1;
}
System.out.println("5"+"="+x);
System.out.println("3"+"="+y);
}
}