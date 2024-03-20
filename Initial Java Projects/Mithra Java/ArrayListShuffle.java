import java.util.*;
import java.util.Collections;

public class ArrayListShuffle
 {
    public static void main(String[] args) 
	{
        // Creating the first ArrayList
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);
		
        // Creating the second ArrayList
        ArrayList<Integer> List2 = new ArrayList<>();
		
        // Shuffling elements from List1 to List2
        Collections.shuffle(List1);
        List2.addAll(List1);
		
        // Displaying both ArrayLists
        System.out.println("List1 (shuffled): " + List1);
        System.out.println("List2: " + List2);
    }	
}

