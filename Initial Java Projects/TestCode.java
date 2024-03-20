import java.util.*;

public class TestCode

{
	public static void main(String args[])
	{
		Scanner TestVar = new Scanner(System.in);
		//System.out.println("Hello " + " First: " + args[0]+ " Second: " +args[1]);
		
		System.out.println("Test Sample Code for Adding Two Variables");
		
		System.out.println("Enter the Value1 : ");
		int a=TestVar.nextInt();
		
		System.out.println("Enter the Value2 : ");
		int b= TestVar.nextInt();
		
		int c= a + b;	
		System.out.println("The Sum of two variables are :" + c);
		
		TestVar.close();
	}	
}

