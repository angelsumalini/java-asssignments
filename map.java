import java.util.*;
import java.util.Scanner;
class map
   {
     public static void main(String args[])
   {
    HashMap<Integer,String> x=new HashMap<Integer,String>();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n value");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
 {
       int key=sc.nextInt();
       String value=sc.next();
       x.put(key,value);
      }
       TreeMap<Integer,String> x2=new TreeMap<Integer,String>(x);
       for(Map.Entry<Integer,String> i:x2.entrySet())
      System.out.println(i.getKey()+" "+i.getValue());
     }
     }