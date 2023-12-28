
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean boy = false;
		boolean girl = false;
		char gender;
		int sum = 0;

		while(boy == false || girl == false ){
			double child = Math.random();
			sum++;
			if(child < 0.5){
				gender = 'b';
				boy = true;
			}
			else{
				gender = 'g';
				girl = true;
			}
			System.out.print(gender + " ");
		}
		System.out.println();
		System.out.println("You made it... and you have " + sum + " children");
	}
}
