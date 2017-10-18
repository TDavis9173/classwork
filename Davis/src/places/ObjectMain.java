package places;

public class ObjectMain {

	public ObjectMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ObjectMain obj = new ObjectMain();
			Object[] people = new Object[15];
			populate(people);
			people[0] = new Thing("fidget spinner");
			for(Object p:people) {
				System.out.println(p);
			}
	}

	private static void populate(Object[] people) {
		for(int i = 0;i< people.length;i++) {
			String firstName = randomNameFrom(Person.FIRST_START,Person.FIRST_MIDDLE,Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START,Person.LAST_MIDDLE,Person.LAST_END);
			Borough home = randomBorough();
			//in an object array, you can have multiple data types
			// this is unlike a primitive array like int[] or boolean[]
			if(Math.random()<.6) {
				int money = (int)(Math.random()*20+1)*10000;
				people[i]=new Athlete(firstName,lastName,home,money);
			}
			else {
			people[i] = new Person(firstName,lastName,home);
			}
		}		
	}

	private static Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}

	private static String randomNameFrom(String[] A, String[] B, String[] C) {
		return get(A)+get(B)+get(C);
	}

	private static String get(String[] a) {
		
		return a[(int)(Math.random()*a.length)];
	}

}
