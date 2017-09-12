package intro;// package declaration: matches folder where this file is located

// class header
public class IntroMain {
	public static final String[] DESCRIPTIONS = {" is trash"," is more trash"," is testing"};
	public static final String[] NAMES = {"MegaLUL","A simple river beast","Kappapolls"};
	// first method executed static because its independent of instances
	public static void main(String[] args) {
		/*
		 * declaration of an instance of CodingConventions
		 * in the same line of code, it is also being instantiated
		 * note the use of the word "new" this word is always used when calling constructors
		 */
		int arraylength = DESCRIPTIONS.length;
		int numberOfPeople = NAMES.length;
				for(int i=0;i< numberOfPeople;i++) {
					CodingConventions conventionsInstance = new CodingConventions(i,i%arraylength );
					conventionsInstance.doStuff();
				}
		//local variables are not fields (has a relationship)
		// they are variables that are only used in the scope of a method
		// after the method they are destroyed
		/*
		 * instance method call (the method belongs to the instance , not the class)
		 */
	}
}
