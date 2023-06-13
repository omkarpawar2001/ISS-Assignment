import java.util.*;

class StudentClass{

	String name;
	float percentage;
	
	StudentClass(String name, float percentage){
		this.name = name;
		this.percentage = percentage;
	}
	
}

class PercentageComparator implements Comparator<StudentClass>{
	public int compare(StudentClass stud1, StudentClass stud2) {
		if(stud1.percentage < stud2.percentage)
			return 1;
		return -1;
	}
}

public class ComparatorInterface{
	
	public static void main(String args[]) {
	
		ArrayList<StudentClass> studList = new ArrayList<StudentClass>();
		
		studList.add(new StudentClass("Gouthami", 90.61f));
		studList.add(new StudentClass("Raja", 83.55f));
		studList.add(new StudentClass("Honey", 85.55f));
		studList.add(new StudentClass("Teja", 77.56f));
		studList.add(new StudentClass("Varshith", 80.89f));
		
		Comparator<StudentClass> com = new PercentageComparator();
		
		Collections.sort(studList, com);
		
		System.out.println("Avg % --> Name");
		System.out.println("---------------------");
		for(StudentClass stud:studList) {
			System.out.println(stud.percentage + " --> " + stud.name);
		}		
	}	
}