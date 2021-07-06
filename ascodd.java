class ascodd 
{    
    public static void main(String args[])
 {                    
        int [] arr = new int [] {5,1,8,2,11,9,13,17,15};     
        int temp = 0;    
   
         System.out.println("Given odd numbers: ");    
        for (int i = 0; i < arr.length; i++)
 {     
            System.out.print(arr[i] + " ");    
        }    
            
           
        for (int i = 0; i < arr.length; i++) 
{     
            for (int j = i+1; j < arr.length; j++) 
{     
               if(arr[i] > arr[j])
 {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();             
        System.out.println("odd numbers in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
{     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    