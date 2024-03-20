import java.util.*;

public class TestAvgStreams 
{
  public static void main(String[] args) 
  {
	/*  
    List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
    System.out.println("List of numbers: " + nums);

    // Calculate the average using streams
    double average = nums.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

    System.out.println("Average value of the numbers: " + average);
	*/
	
	Scanner num = new Scanner(System.in);
	ArrayList<Integer> ary1=new ArrayList<Integer>();
  
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
			Integer aa=num.nextInt();
			ary1.add(aa);
		}
		
		double average = ary1.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);		
		System.out.println("Average value of the numbers: " + average);
		
  }
}