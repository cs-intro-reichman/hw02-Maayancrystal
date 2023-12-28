/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		int x = Integer.parseInt(args[0]);
		int d = 1;
		while (d <= x) {
			if (x % d == 0) {
				System.out.println(d);
			}
			d++;
		}
	}
}
