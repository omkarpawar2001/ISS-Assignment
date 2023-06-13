import java.util.*;

public class RetrieveData {
	public static void main(String[] args) {
// Call AddingData class by creating object of that class. 
		AddingData data = new AddingData();

// Call studentData() method using reference variable data. 
		ArrayList<CustomObject> listst = data.studentData();

// Now iterate and display all the Student data. 
		for (CustomObject st : listst) {
			System.out.println("Student's name: " + st.name);
			System.out.println("Student ID: " + st.id);
			System.out.println("Roll number: " + st.rollNo);
		}
	}
}