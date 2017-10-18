package places;

public class Athlete extends Person {
	private int money;
	public Athlete(String first, String last, Borough home,int money) {
		//the first line must call a super constructor
		super(first, last, home);
		this.money=money;
	}

	public String toString() {
		//to call super methods , use super.
		return super.toString() + "I also have $"+money+"!";
	}
}
