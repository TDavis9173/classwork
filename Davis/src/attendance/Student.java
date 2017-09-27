package attendance;

public class Student implements Attendee {
	private String first;
	private String last;
	private String s1;
	private boolean present=false;
	public Student(String firstName, String lastName){
		this.first= firstName;
		this.last=lastName;
	}
	public boolean isPresent() {
		if(present==false) {
			return false;
		}
		else
			return true;
	}
	public void setPresent(boolean present) {
		this.present=present;
	}
	public String getFirstName() {
		return this.first;
	}
	public String getLastName() {
		return this.last;
	}
	public boolean mathces(String first, String last) {
		if(this.first.toLowerCase().equals(first.toLowerCase())&& this.last.toLowerCase().equals(last.toLowerCase())) {
			return true;
		}
		else
			return false;
	}
	public boolean matches(String last) {
		if(this.last.toLowerCase().equals(last.toLowerCase())) {
			return true;
		}
		else
			return false;
	}
	public String getReportString() {
		 this.s1 = this.last;
		while ( s1.length()<20) {
			s1+=" ";
		}
		s1+=this.first;
		while ( s1.length()<40) {
			s1+=" ";
		}
		if(this.present==false) {
			s1+="Absent";
			return s1;
		}
		else {
			s1 +="Present";
			return s1;
		}
	}
}
