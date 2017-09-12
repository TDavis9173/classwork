package intro;

public class CodingConventions {
	// Fields are at the top!!11!!!
	private String name;//note: declare fields only, instantiate in the constructor
	private String description;
	
	// constructor like a method however the return type is instance of the class
	// constructor must ALWAYS be named after the class
	public CodingConventions(int nameIndex, int descriptionIndex) {
		//instantiate variables now
		
		// there are 2 variables called name the local variable and the field
		// distinguish between the two using the reserved word "this"
		name = IntroMain.NAMES[nameIndex];
		// this is a static call to a constant
		description = IntroMain.DESCRIPTIONS[descriptionIndex];
	}
	//normal method "void" is the return type
	public void doStuff() {
		// static method call:
		String output = name + description; // use spaces in between operations
		System.out.println(output);
	}

}
