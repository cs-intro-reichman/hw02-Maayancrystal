/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
	int a = (int)(Math.random() * 10);
	System.out.println(a);
	int b = a;
	while (b >= a) {
		b = (int)(Math.random() * 10);
			if (b >= a) {
			System.out.println(b);
			a = b;	
			}
		}
	}
}
