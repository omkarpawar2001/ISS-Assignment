
public class Strings {
	public static void main(String args[]){
		String s1="Hello";
		String s2="World";
		System.out.println("string length is: "+s1.length());
		System.out.println("string length is: "+s2.length());
		s1=s1.concat("What is your good name?");
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1+"How are you doing today");        // without trim()
		System.out.println(s1.trim()+"How are you doing today");
		String s1lower=s1.toLowerCase();
		System.out.println(s1lower);
		String replaceString=s1.replace('h','t');
		System.out.println(replaceString);
		System.out.println(s1.charAt(4));
		System.out.println(s1.substring(3));
		System.out.println(s1.indexOf('a'));
		}
	
}
