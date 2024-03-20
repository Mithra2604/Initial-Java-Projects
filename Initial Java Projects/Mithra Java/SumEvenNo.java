
public class SumEvenNo
{
	public static void main(String args[])
	{
		int n=10;
		int sum=0;
		System.out.println("Displaying Sum of Even Nos");
		for(int i=0; i < n; i++)
		{
			if (i % 2 ==0) 
			{
				sum = sum + i;				
			}
		}
		System.out.println(sum);
		
	}
	
}

