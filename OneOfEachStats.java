import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  

		int twoChild = 0; //count the number of families with 2 kids
		int threeChild = 0; //count the number of families with 3 kids
		int fourChild = 0; //count the number of families with 4 or more kids.
		int totalChildren = 0; //count the total number of kids is all of the families

		for(int t = 1 ; t <= T ; t++){
			boolean boy = false;
			boolean girl = false;
			char gender;
			int numberOfChildren = 0; //count the number of kids of a specific family
			
			while(boy == false || girl == false ){
				double child = generator.nextDouble();
				numberOfChildren++;

				if(child < 0.5){
					gender = 'b';
					boy = true;
				}
				else{
					gender = 'g';
					girl = true;
				}
			
			}

			totalChildren = totalChildren + numberOfChildren;
			if(numberOfChildren >= 4){
			fourChild++;
			}
			else if(numberOfChildren == 3){
				threeChild++;
				}
				else if(numberOfChildren == 2){
					twoChild++;
					
				}
				
		}

	double avg = (double)totalChildren / T;

	System.out.println("Average: " + avg + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + twoChild );
	System.out.println("Number of families with 3 children: " + threeChild);
	System.out.println("Number of families with 4 or more children: " + fourChild);
	if((twoChild > threeChild) && (twoChild > fourChild)){ //2 children is most common
			System.out.println("The most common number of children is 2.");
		}
		else{
			if(threeChild > fourChild){
				System.out.println("The most common number of children is 3.");	
			}
			else{
				System.out.println("The most common number of children is 4 or more.");	
			}
		}
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
