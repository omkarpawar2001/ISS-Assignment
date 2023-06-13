
public class Loops {
	public static void main(String[] args) {  
	    //Code of Java for loop  
		System.out.println("For Loop\n");
	    for(int i=1;i<=10;i++){  
	        System.out.println(i);  
	    }  
	    
	    //Code for Nested for loop
	    System.out.println("Nested-For Loop\n");
	    //loop of i  
	    for(int i=1;i<=3;i++){  
		    //loop of j  
		    for(int j=1;j<=3;j++){  
		            System.out.println(i+" "+j);  
		    }//end of i  
	    }//end of j  
	    
	    //For-each loop
	    System.out.println("For-Each Loop\n");
	    //Declaring an array  
	    int arr[]={12,23,44,56,78};  
	    //Printing array using for-each loop  
	    for(int i:arr){  
	        System.out.println(i);  
	    }  
	}  
}
