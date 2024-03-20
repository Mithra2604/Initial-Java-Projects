import java.util.*;

public class TestDivisible

{
	public static void main(String args[])
	{
		
		Scanner TestVar = new Scanner(System.in);
		//System.out.println("Hello " + " First: " + args[0]+ " Second: " +args[1]);
		
		System.out.println("Find the Number is Divisible by 5 and 11");
		//int x = 0;
		
		System.out.println("Enter the Value : ");
		int x=TestVar.nextInt();
		
		//System.out.println("Enter for the Value2 : ");
		//int b= TestVar.nextInt();
		
		
		//int x =22;
		
		if (x % 5==0 && x % 11==0) 
		{
			System.out.println(x + " is Divisible by Both 5 and 11");
		}
		else 
		{
			System.out.println(x + " is Not Divisible by Both 5 and 11");
		}

		//TestVar.close();
	}	
}
