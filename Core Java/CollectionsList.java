import java.util.*;
public class CollectionsList {
 
    public static void main(String args[])
    {
 
    	// Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);
        
     // change the element of the array list
        numbers.set(2, 67);
        System.out.println("List: " + numbers);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        
     // Creating list using the LinkedList class
        List<Integer> numbers1 = new LinkedList<>();

        // Add elements to the list
        numbers1.add(12);
        numbers1.add(23);
        numbers1.add(34);
        System.out.println("List: " + numbers1);

        // Access element from the list
        int number1 = numbers1.get(2);
        System.out.println("Accessed Element: " + number1);

        // Using the indexOf() method
        int index1 = numbers1.indexOf(34);
        System.out.println("Position of 34 is " + index1);
        


        // Remove element from the list
        int removedNumber1 = numbers1.remove(1);
        System.out.println("Removed Element: " + removedNumber1);
    
        
    }
}

/*Methods	Descriptions
size()	Returns the length of the arraylist.
sort()	Sort the arraylist elements.
clone()	Creates a new arraylist with the same element, size, and capacity.
contains()	Searches the arraylist for the specified element and returns a boolean result.
ensureCapacity()	Specifies the total element the arraylist can contain.
isEmpty()	Checks if the arraylist is empty.
indexOf()	Searches a specified element in an arraylist and returns the index of the element.*/