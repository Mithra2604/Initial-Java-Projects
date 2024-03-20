public class ArraySum
{
	public static void main(String args[])
	{
		//int [] array = {10,20,30,40,50};  
		sum();		
	}
	static void sum()
	{
		int [] array = {10,20,30,40,50}; 
		int temp = 0;
		for (int i=0; i < array.length; i++)
		{
			temp=temp + array[i];
			
		}
		System.out.print(temp); 
	}
}