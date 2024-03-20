import java.util.*;

public class TestStream
{
	public static void main(String args[])
	{
		Scanner num = new Scanner(System.in);
		ArrayList<Integer> lst1=new ArrayList<Integer>();
		ArrayList<Integer> lst2=new ArrayList<Integer>();
		ArrayList<Integer> arraylst=new ArrayList<Integer>();
	
		System.out.println("Even a Array Size:");
		int x=num.nextInt();
		
		while(x<=0)
		{
			System.out.println("Even Positive Number");
			System.out.println("Even a Array Size:");
			break;
		}
		
		for(int i=1; i<=x; i++)
		{				
			System.out.println("Enter Number:");			
			Integer x1=num.nextInt();
			arraylst.add(x1);
			
			if (x1 % 2 ==0) 
			{
				lst1.add(x1);
			}
			else 
			{
				lst2.add(x1);
			}
		}		
			System.out.println("Total Array List: " + arraylst);
			System.out.println("Even Numbers of an Array is: " + lst1);
			System.out.println("Odd Numbers of an Array is: " + lst2);
			
			arraylst.stream().filter(x1->x1%2!=0).forEach(System.out::println);
			//arraylst.stream().filter(x1->x1%2==0).forEach(System.out::println);
			arraylst.stream().filter(x1->x1%2==0).forEach(x1 -> System.out.println("Even Numbers of an Array is:" +x1));
		
	}
}