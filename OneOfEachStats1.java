/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		int twoChild = 0;
		int threeChild = 0;
		int fourChild = 0;
		int totalChildren = 0;

		for(int t = 0 ; t <= T ; t++){
			boolean boy = false;
			boolean girl = false;
			char gender;
			int numberOfChildren = 0;
			
			while(boy == false || girl == false ){
				double child = Math.random();
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
			if(numberOfChildren == 2){
			twoChild++;
			}
			else{
				if(numberOfChildren == 3){
				threeChild++;
				}
				else {
					if(numberOfChildren == 4){
					fourChild++;
					}
				}
			}	
		}

	double avg = totalChildren / T;

	System.out.println("Average: " + avg + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + twoChild );
	System.out.println("Number of families with 3 children: " + threeChild);
	System.out.println("Number of families with 4 children: " + fourChild);
	if((twoChild > threeChild) && (twoChild > fourChild)){ //2 children is most common
			System.out.println("The most common number of children is 2");
		}
		else{
			if(threeChild > fourChild){
				System.out.println("The most common number of children is 3");	
			}
			else{
				System.out.println("The most common number of children is 4 or more");	
			}
		}
	}

	}

