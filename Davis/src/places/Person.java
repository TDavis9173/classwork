package places;

public class Person {
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	
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
	friends = new Person[3];
	hobby = Hobby.randomHobby();
	}
public void stateYourFriends() {
	String s = "";
	for(int i=0;i<friends.length;i++) {
		if(i!=friends.length-1) {
			s += friends[i].firstName+", ";
		}
		else {
			s += "and "+friends[i].firstName;
		}
		System.out.println(s);
	}
}
public void setInFirstPlace(Person f) {
	for(int i = friends.length -1;i>0;i--) {
		friends[i] = friends[i-1];
	}
	friends[0]=f;
}
public void mingle(Person[] peers) {
	for(Person p: peers) {
		if(p!= this) {
			setInFirstPlace(p);
		}
	}
}
public String toString() {
	return "My name is "+firstName+" "+lastName+" and I am from "+home+".";
}
}