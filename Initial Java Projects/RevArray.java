public class RevArray
{
	public static void main(String args[])
	{
		int array[]={2,23,14,77,88,62,01};
		for (int i=0; i < array.length; i++)
		{
			System.out.println(array[i]+ " ");
		}
		System.out.println("Array in reverse order: ");  
        for (int i = array.length-1; i >= 0; i--) 
		{  
            System.out.print(array[i] + " ");  
        }  
	}
}
