package places;

public class Person {
	private String firstName;
	private String lastName;
	private Borough home;
	
	public static final String[] FIRST_START = {"Chr","Am","L","Th","An","Br","B"};
	public static final String[] FIRST_MIDDLE = {"ala","ima","e","o","anna","ola","alpha"};
	public static final String[] FIRST_END = {"na","ch","n","rain","dab","darf","thonk"};
	
	public static final String[] LAST_START = {"Bl","Gr","Ph","M","Thr","Br","O"};
	public static final String[] LAST_MIDDLE = {"an","in","ast","own","il","elle","asdf"};
	public static final String[] LAST_END = {"strom","son","rack","les","vin","ston","beep"};
public Person(String first,String last,Borough home) {
	this.firstName = first;
	this.lastName = last;
	this.home =home;
	}
public String toString() {
	return "My name is "+firstName+" "+lastName+" and I am from "+home+".";
}
}