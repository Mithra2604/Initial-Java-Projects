
public class DigitsInNo
{
	public static void main(String args[])
	{
		int no = 789456123;
		int digit = 0;
		
		while(no != 0)
		{
			no = no / 10;
			digit++;
		}
		System.out.print("Number of Digits = "+digit);	
		
		
	}
	
}
