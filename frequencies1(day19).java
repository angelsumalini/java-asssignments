import java.util.*; 
class frequencies1
{
public static void main(String args[])
{
HashMap<String,Integer> x=new HashMap<String,Integer>();
String[] s={"rama","gita","rama","lakshmi","rama","gita","lakshmi","sita","lakshmi"};
for(int i=0;i<s.length;i++)
{
String key=s[i];
if(x.containsKey(key))
x.put(key,x.get(key)+1);
else
x.put(key,1);
}
for(Map.Entry<String,Integer> m:x.entrySet())
{
if(m.getValue()>2)
System.out.println(m.getKey()+"="+m.getValue()); 
}
}
}