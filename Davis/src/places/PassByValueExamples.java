package places;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassByValueExamples {

	public PassByValueExamples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s ="Hello";
		Person p = new Person("Random","Dude",Borough.NY_BOROUGHS[0]);
		int x =5;
		int[] arr = {1,2,3};
		test3(arr);
		System.out.println(s+" "+x+" "+Arrays.toString(arr));

	}

	private static void test1(Person p) {
		String name =p.getFirstName();
		name = "Original";
		p.setFirstName(name);
	}
	private static void test3(int[] arr) {
		arr[0]=999;
		arr[1] =6969;
	}
	private static void changeEVERYTHING(String s, int x, int[] arr) {
		s="dab on them haters";
		x=69;
		arr = new int[2];
		arr[0]=420;
		arr[1]= 666;
		
	}

}
