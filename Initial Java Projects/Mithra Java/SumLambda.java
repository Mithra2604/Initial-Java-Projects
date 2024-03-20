import java.util.*;

public class SumLambda
{
	interface Sum
	{
		int sum(int a, int b);
	}
	public static void main(String Args[])
		{
			Sum sumvalue=(x,y)-> x+y;
			int result=sumvalue.sum(12,2);
			System.out.println("Sum of 12+2 is: " + result);
		}	
}

