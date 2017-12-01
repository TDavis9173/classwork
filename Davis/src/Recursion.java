
public class Recursion {
	 public static void main(String[] args){
		 int value = 18;
		 int count =0;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 }

		 public static int countPrimeFactors(int value, int testPrime) {
		 return 0;
		 }

		 public static long factorial(long value) {
		 if(value==1) {
			 return value;
		 }
		 return factorial(value-1)*value;
		 }
}
