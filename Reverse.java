/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String s = args [0];
		int length = s.length() -1;

		for (int i = length ; i >= 0; i--){
			System.out.print(s.charAt(i));
		}
		
		char middle = s.charAt(length/2);
		System.out.println();
		System.out.println("The middle character is " + middle);
		
	}
}
