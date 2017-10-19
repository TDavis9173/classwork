package places;

public class ObjectMain {

	public ObjectMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ObjectMain obj = new ObjectMain();
			Person[] people = new Person[15];
			populate(people);
			//people[0] = new Thing("fidget spinner");
			//Person[] group = selectGroup(people,34);
			//analyzeCommonalities(people,group);
			for(Person p:people) {
				p.mingle(people);
				System.out.println(p);
				p.stateYourFriends();
			}
	}
	private static void analyzeCommonalities(Person[] people, Person[] group) {
		double averageCommonality=0;
		double trials = 30;
		double ok= 0;
		for(int i=0;i<trials;i++) {
			group = selectGroup(people,group.length);
			ok += countCommonalities(people,group);
		}
		averageCommonality=ok/trials;
		System.out.println(averageCommonality+" is avg for "+trials+" trials.");
	}

	private static int countCommonalities(Object[] arr1, Object[] arr2) {
		int z =0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				z++;
			}
		}
		return z;
	}

	private static void populate(Person[] people) {
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
	private static Person[] selectGroup(Person[] population,int length) {
		Person[] dab= new Person[length];
		for(int i=0;i<length;i++) {
			Person d= randomPerson(population);
			while(alreadyContains(dab,d)) {
				d=randomPerson(population);
			}
			dab[i]=d;
		}
		return dab;
	}
	private boolean areRepeats(Person[] people){
		for(int i=0;i<people.length;i++) {
			for(int z=i+1;z<people.length;z++) {
				if(people[i]==people[z]) {
					return true;
				}
			}
		}
		return false;
	}
	private static Person randomPerson(Person[] population) {
		return population[(int)(Math.random()*population.length)];
	}
	private static boolean alreadyContains(Person[] population, Person p) {
		for(int i=0;i<population.length;i++) {
			if(population[i]==p) {
				return true;
			}
		}
		return false;
	}
	private static void shuffle(Person[] arr) {
		int x = 10000;
		int z = arr.length;
		for(int i=0;i<x;i++) {
			int a =(int)(Math.random() * z);
			int b = (int)(Math.random() * z);
			swap(arr,a,b);
		}
	}
	private static void swap(Person[] arr, int i, int j) {
		Person x = arr[i];
		arr[i]=arr[j];
		arr[j]=x;
		
	}
}
