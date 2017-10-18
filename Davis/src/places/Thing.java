package places;

public class Thing {
	private String description;

	public Thing(String d) {
		this.description=d;
	}
	public String toString() {
		return "I am a "+description+". What did you expect!?";
	}
}
