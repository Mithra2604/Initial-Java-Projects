import java.util.*;

public class ArrayListCopy {
    public static void main(String[] args) {
        // Creating the source ArrayList
        ArrayList<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);
        sourceList.add(5);

        // Creating the destination ArrayList
        ArrayList<Integer> destinationList = new ArrayList<>();

        // Copying elements from sourceList to destinationList
        for (Integer element : sourceList) {
            destinationList.add(element);
        }

        // Displaying both ArrayLists
        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List: " + destinationList);
    }
}

