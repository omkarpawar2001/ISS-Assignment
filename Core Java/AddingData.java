
import java.util.ArrayList; 
public class AddingData 
{ 
// Create a ArrayList method of generic type 'Student'. 
   ArrayList<CustomObject> studentData()
   { 
// Create three objects of the class Student and pass arguments to the constructor. 
	   CustomObject s1 = new CustomObject("Omkar", 1234, 04); 
	   CustomObject s2 = new CustomObject("Sushil", 4321, 20 ); 
	   CustomObject s3 = new CustomObject("Vaibhav", 1212, 02); 

// Create the object of ArrayList of generic type 'Student'. 
    ArrayList<CustomObject> studentlist = new ArrayList<CustomObject>(); 

// Now add Student objects in the ArrayList using reference variable studentlist. 
     studentlist.add(s1); 
     studentlist.add(s2); 
     studentlist.add(s3); 

// Return object reference variable 'studentlist' of the array list to the method 'studentValue'. 
     return studentlist; 
   } 
}
