import java.util.*;

public class CntHashMap
{
	public static void main(String args[])
	{
		Scanner mapcnt1=new Scanner(System.in);
		Scanner mapcnt2=new Scanner(System.in);
		
		HashMap<Integer, String> cnt1=new HashMap<Integer,String> ();
		
		//Adding ArrayList Dynamically
		for(int i=0; i<=2; i++)
		{				
			System.out.println("Enter Values");			
			Integer x=mapcnt1.nextInt();

			System.out.println("Enter Name");			
			String x1=mapcnt2.nextLine();
			
			cnt1.put(x,x1);			
		}
		System.out.println(cnt1);
		System.out.println(cnt1.get(2));
	}
}

