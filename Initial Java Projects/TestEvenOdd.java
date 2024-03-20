import java.util.*;

public class TestEvenOdd

{
	public static void main(String args[])
	{
		
		Scanner TestVar = new Scanner(System.in);
		//System.out.println("Hello " + " First: " + args[0]+ " Second: " +args[1]);
		
		System.out.println("Even Or Odd Numbers");
		//int x = 0;
		
		System.out.println("Enter the Value : ");
		int x=TestVar.nextInt();
		
		//System.out.println("Enter for the Value2 : ");
		//int b= TestVar.nextInt();
		
		
		//int x =22;
		
		if (x % 2 ==0) 
		{
			System.out.println(x + " is Even Number");
		}
		else 
		{
			System.out.println(x + " is Odd Number");
		}

		TestVar.close();
	}	
}
