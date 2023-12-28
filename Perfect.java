/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here

		int n = Integer.parseInt(args[0]);
		String isPerfect = (n + " is a perfect number since " + n + " = 1"); 
		int sum = 1;
		String add;
		

		for (int divisor = 2 ; divisor < (n-1) ; divisor++) { 
			System.out.println("divisor" + divisor);
			if (n % divisor == 0){ //checks if divisor is a divider of n
				add = " + " + divisor;
				System.out.println(add);
				isPerfect = isPerfect + add;
				System.out.println(isPerfect);
				sum = sum + divisor;
				System.out.println(sum);
			}
		}


		if (n == sum) { //checks if n is perfect
				System.out.println(isPerfect);
		}
		else {
				System.out.println(n + " is not a perfect number");
		}
	}
}
