import java.util.*;
class CollectionsSet {

    public static void main(String[] args) {
    	 Set<Integer> set1 = new HashSet<>();

         // Add elements to the set1
         set1.add(2);
         set1.add(3);
         System.out.println("Set1: " + set1);

         // Creating another set using the HashSet class
         Set<Integer> set2 = new HashSet<>();

         // Add elements
         set2.add(1);
         set2.add(2);
         System.out.println("Set2: " + set2);

         // Union of two sets
         set2.addAll(set1);
         System.out.println("Union is: " + set2);
         
         
      // Creating a set using the TreeSet class
         Set<Integer> numbers = new TreeSet<>();

         // Add elements to the set
         numbers.add(2);
         numbers.add(3);
         numbers.add(1);
         System.out.println("Set using TreeSet: " + numbers);

         // Access Elements using iterator()
         System.out.print("Accessing elements using iterator(): ");
         Iterator<Integer> iterate = numbers.iterator();
         while(iterate.hasNext()) {
             System.out.print(iterate.next());
             System.out.print(", ");
         }
    }
}
/*Methods of Set
The Set interface includes all the methods of the Collection interface. It's because Collection is a super interface of Set.

Some of the commonly used methods of the Collection interface that's also available in the Set interface are:

add() - adds the specified element to the set
addAll() - adds all the elements of the specified collection to the set
iterator() - returns an iterator that can be used to access elements of the set sequentially
remove() - removes the specified element from the set
removeAll() - removes all the elements from the set that is present in another specified set
retainAll() - retains all the elements in the set that are also present in another specified set
clear() - removes all the elements from the set
size() - returns the length (number of elements) of the set
toArray() - returns an array containing all the elements of the set
contains() - returns true if the set contains the specified element
containsAll() - returns true if the set contains all the elements of the specified collection
hashCode() - returns a hash code value (address of the element in the set)*/