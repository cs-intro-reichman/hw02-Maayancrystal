/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		for(int col = 1; col <= n; col++){
			for(int row = 1; row <= n; row++){
				if(col % 2 != 0){
				System.out.print("* ");
				}
				else{
				System.out.print(" *");	
				}
			}
			System.out.println();
			
		}

	}
}
