import java.util.*;

public class CopyArray
{
	public static void main(String args[])
	{		
		Scanner CopyArray=new Scanner(System.in);
		
		// Creating the New ArrayList1
		ArrayList<Integer> array1=new ArrayList<Integer>();
		
		System.out.println("Enter the ArrayList Items");
		
		//Adding ArrayList Dynamically
		for(int i=0; i<=2; i++)
		{			
			System.out.println("Enter Values");
			int x=CopyArray.nextInt();
			array1.add(x);
		}
		
		// Creating the New ArrayList2
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        // Copying from Array1 to Array2
        for (int element : array1) 
		{
            array2.add(element);
        }
			
        // Displaying both ArrayLists
        System.out.println("Array 1: " + array1);
        System.out.println("Array 2: " + array2);
	}

}
