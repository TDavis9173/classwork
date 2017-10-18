package places;

public class Borough {
	public static final Borough[] NY_BOROUGHS = {new Borough("Brookyln"),new Borough("Manhattan"),new Borough("Queens"),new Borough("Bronx"),new Borough("Staten Island")};
	private String name;
	public Borough(String n) {
		this.name=n;
	}
	public String toString() {
		return name;
	}
}
