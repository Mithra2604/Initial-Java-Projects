import java.util.*;

public class TestMaxNo

{
	public static void main(String args[])
	{
		Scanner TestVar = new Scanner(System.in);
		//System.out.println("Hello " + " First: " + args[0]+ " Second: " +args[1]);
		
		System.out.println("Maximum of Two Numbers");
		
		System.out.println("Enter for the Value1 : ");
		int a=TestVar.nextInt();
		
		System.out.println("Enter for the Value2 : ");
		int b= TestVar.nextInt();
		
		//System.out.println(Math.max(a, b)); 
		System.out.println("The Maximum Value is :" + Math.max(a, b));
		
		TestVar.close();
	}	
}

