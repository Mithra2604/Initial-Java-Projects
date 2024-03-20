import java.util.*;

class SearchArrayList
{
	public static void main(String args[])
	{
		Scanner arr=new Scanner(System.in);
		ArrayList<Integer> array1=new ArrayList<Integer>();
		
		for(int i=0; i<=4; i++)
		{			
			System.out.println("Enter the "+i+" Word");
			//for string 
			//String x=arr.nextLine();
			int x=arr.nextInt();
			array1.add(x);
		}
		    int val=11;
			int ans=0;
			for (int j:array1)
			{
				if (j==val)
				{
					ans=(array1.indexOf(j));
				    System.out.println("answer is"+ans);
					break;
				}
				else
				{
					System.out.println("no");					
				}
				
			}

		

	}
}

