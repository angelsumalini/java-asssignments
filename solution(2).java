class solution{
public static int map(int n, String keys[], int arr[], String s)
       {
   HashMap<String,Integer> x = new HashMap<String,Integer>();
       for(int i=0;i<n;i++)
       x.put(keys[i],arr[i]);
     if(x.containsKey(s))
        {
   int y =x.get(s);
      return y;
     }
    else
    return -1;
  }
}