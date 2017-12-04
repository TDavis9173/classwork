package pocketMonster;

public class Towers {
	public static void main(String[] args){
		 	 solve(4,"A","B","C");
		  }
	

	/* private static void solve(int n, String start, String help, String end) {
		if(n==1) {
			System.out.println("_______");base case
		}
		else { 
		if(n%2 == 0) {check if even or odd
				System.out.println(start+" to "+help);recursion depending on what it was
				solve(n-1, help, end, start);
			}else {
				System.out.println(start+" to "+end);
				solve(n-1, start, help, end);
			}
		}
	}
	*/
	 private static void solve(int n, String start, String help, String end) {
			if(n==1) {// original base case was wrong its 1 not 0 as zero is not needed
				System.out.println(start+" to "+end);//you move to the non help pillar
			}else {// if its not the base case then everything else is changed
				solve(n-1, start, end, help);// for each step you remove a disc from the stack your moving
				//parameters change because not every stack is being built on the C pillar
				System.out.println(start+" to "+end);// with the changed parameters we print from start to end
				// the B pillar is now the end pillar and the C pillar is not the help one
				solve(n-1, help, start, end);// You do it again because for each recursion you need the number of moves for
				// the n-1 length pillar *2 +1
				// this time help is A and Start is B with end at C
			}
		}
}
