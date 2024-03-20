public class SortArray
{    
    public static void main(String[] args) 
	{            
        int [] array = {85,12,78,70,25,47,77};     
        int temp = 0;    
        for (int i = 0; i < array.length; i++) 
		{     
            for (int j = i+1; j < array.length; j++) 
			{     
               if(array[i] > array[j]) 
			   {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;    
               }     
            }     
        }         
        System.out.println("Array sorted in ascending order: ");    
        for (int i = 0; i < array.length; i++) 
		{     
            System.out.print(array[i] + " ");    
        }    
    }    
}    
