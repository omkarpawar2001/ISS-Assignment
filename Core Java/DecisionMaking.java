public class DecisionMaking {
	public static void main(String args[])
    {
		//	if
        int i = 10;
        System.out.println("If");
        System.out.println("-----------------------");
        if (i < 15)
            System.out.println("Inside If block"); // part of if block(immediate one statement after if condition)
            System.out.println("10 is less than 15"); //always executes as it is outside of if block
        System.out.println("I am Not in if");
        
        //  if-else
        System.out.println("If-Else");
        System.out.println("-----------------------");
        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");
//        nested-if
        System.out.println("Nested If");
        System.out.println("-----------------------");
        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
 
            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(
                    "i is smaller than 12 too");
        } else{
                System.out.println("i is greater than 15");
        }
//        else-if ladder
        System.out.println("If-Else Ladder");
        System.out.println("-----------------------");
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
        
        
//        switch-case
        System.out.println("Switch-Case");
        System.out.println("-----------------------");
        int num=20;
        switch(num){
        case 5 :  System.out.println("It is 5");
                  break;
        case 10 : System.out.println("It is 10");
                  break;
        case 15 : System.out.println("It is 15");
                  break;
        case 20 : System.out.println("It is 20");
                  break;
        default:  System.out.println("Not present");
           
      }
    }
}
