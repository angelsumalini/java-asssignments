import java.util.Arrays;
import java.util.Vector;

class my
{
 

    static int primeCount(int arr[], int n)
    {
        int max_val = Arrays.stream(arr).max().getAsInt();
        Boolean[] prime = new Boolean[max_val + 1];
        for (int i = 0; i < max_val + 1; i++)
        {
            prime[i] = true;
        }
 
         prime[0] = false;
        prime[1] = false;
        for (int p = 2; p * p <= max_val; p++)
        {
              if (prime[p] == true)
            {
 
 
                for (int i = p * 2; i <= max_val; i += p)
                {
                    prime[i] = false;
                }
            }
        }
  
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (prime[arr[i]])
            {
                count++;
            }
        }
 
        return count;
    }
 
        public static void main(String[] args)
    {
        int arr[] = {1,2,3,5,7,11,14,23};
        int n = arr.length;
        System.out.println(primeCount(arr, n));
    }
}