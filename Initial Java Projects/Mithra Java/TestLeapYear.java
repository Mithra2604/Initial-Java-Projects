import java.util.*;

public class TestLeapYear

{
	public static void main(String args[])
	{
		
		Scanner TestVar = new Scanner(System.in);
		//System.out.println("Hello " + " First: " + args[0]+ " Second: " +args[1]);
		
		System.out.println("Find the year is Leap Year or Not");
		//int x = 0;
		
		System.out.println("Enter the Value : ");
		int x=TestVar.nextInt();
		
		//System.out.println("Enter for the Value2 : ");
		//int b= TestVar.nextInt();
		
		
		//int x =22;
		
		if (x % 4==0) 
		{
			System.out.println(x + " is Leap Year");
		}
		else 
		{
			System.out.println(x + " is Not Leap Year");
		}

		//TestVar.close();
	}	
}
