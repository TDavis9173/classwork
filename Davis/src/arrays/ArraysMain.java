package arrays;

import java.util.Arrays;

public class ArraysMain {
	
	private String[] suits;
	private String[] values;

	public ArraysMain() {
		wendsdayMethods();
	}
	
	private void tuesdayMethods() {
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		cycleThrough(orderTest,5);
		System.out.println(Arrays.toString(orderTest));
		
	}
	private void wendsdayMethods() {
		int[] diceRolls = new int [99999999]; 
		populate(diceRolls);
		int[] data=longestConsecutiveSeqAndIndex(diceRolls);
		int longest = data[0];
		System.out.println("longest was "+longest+" on "+data[1]+" the sequence was:"+ Arrays.toString(subArray(diceRolls,data[1],data[0]))+".");
	}
	//usually a method returns 1 piece of data however with arrays multiple pieces of data can be returned
	private int[] longestConsecutiveSeqAndIndex(int[] arr) {
		int[] data= new int[2];
		data[0]=1;
		int count =1;
		for(int i= 0;i<arr.length;i++) {
			while(i+count<arr.length && sequence(arr,i,i+count)) {
				count++;
			}
			if(count>data[0]) {
				data[0]=count;
				data[1]=i;
			}
			i = i+count-1;
			count = 1;
		}
		return data;
		
	}

	private void cycleThrough(int[] arr, int z) {
		for(int i=0;i<z;i++) {
			frontToBack(arr);
		}
		
	}

	private int longestConsecutiveSequence(int[]arr) {
		int max=1;
		int count =1;
		for(int i= 0;i<arr.length;i++) {
			while(i+count<arr.length && sequence(arr,i,i+count)) {
				count++;
			}
			if(count>max) {
				max=count;
			}
			i = i+count-1;
			count = 1;
		}
		return max;
	}
	private boolean sequence(int[]arr, int start,int end) {
		int z=end-start+1;
		for(int i=start;i<end;i++) {
			if(arr[i]!=arr[i+1]-1) {
				return false;
			}
		}
		return true;
	}

	private void frontToBack(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			swap(arr,i,i+1);
		}
	}

	private void printDeck() {
		String[] deck = new String[52];
		int idx = 0;
		for(String suits:suits) {
			for(String values:values) {
				deck[idx] = values + " of " +suits;
			}
		}
	}
	public void cardMethods() {
		suits = new String[4];
		suits[0]="Clubs";
		suits[1]="Hearts";
		suits[2]="Diamonds";
		suits[3]="Spades";
		values = new String[13];
		for(int i=0;i<values.length;i++) {
			values[i]= ""+(i+1);
		}
		values[0]="Ace";
		values[12]="King";
		values[11]="Queen";
		values[10]="Jack";
		printDeck();
	}	
	private void warmUpMethods() {
		int[] orderTest = {1,2,3,4,5,6,7,8,9,10};
		reverseOrder(orderTest);
		System.out.println(Arrays.toString(orderTest));
		System.out.println(Arrays.toString(subArray(orderTest,3,4)));
	}
	private void shuffle(int[] arr) {
		int x = 10000;
		int z = arr.length;
		for(int i=0;i<x;i++) {
			int a =(int)(Math.random() * z);
			int b = (int)(Math.random() * z);
			swap(arr,a,b);
		}
	}
	private void reverseOrder(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			swap(arr,i,arr.length-1-i);
		}
	}
	private int[] subArray(int[]arr,int psn,int length){
		int[] z = new int[length];
		for(int i=0;i<length;i++) {
			z[i]=arr[psn+i];
		}
		return z;
	}
	private void swap(int[] arr, int i, int j) {
		int x = arr[i];
		arr[i]=arr[j];
		arr[j]=x;
		
	}

	private void populate1ToN(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1);
		}
		
	}

	private void countOccurences(int[] arr, int start, int end) {
		int[] counter = new int[end - start + 1];
		for(int value:arr) {
			counter[value- start]++;
		}
		for (int i=0;i<counter.length;i++) {
			System.out.println("The value "+(i+start)+ "was rolled "+counter[i]+ "times");
		}
	}

	private void populate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=diceRoll(2);
		}
	}

	public void arrayNotes() {
		// two ways to construct and array
				int[] firstway = {0,1,2,3,4,5,};
				//will only work with the declaration
				
				String[] secondWay = new String[5];
				//secondWay[0]=1;
				//secondWay[1]=10;
				//2 ways to iterate through an array
				for (int i=0;i<secondWay.length;i++) {
					System.out.println("The #"+i+ " element is "+secondWay[i]);
				}
				for(String value: secondWay) {
					System.out.println("Element is"+value);
				}
				// primitive arrays are auto-populated with 0s
				// Object arrays are not populated (null)
	}
	public static void main(String[] args) {
		ArraysMain sample = new ArraysMain();
		// Arrays are collections of primitives and objects
		// This is the ONLY collection of primitives 
		
		// size cannot be edited
		
		// elements of an array are REFERENCES to objects
		// changing an element of an array changes the reference not the object

	}
	//returns the result after rolling n number of dice
	public int diceRoll(int n) {
		int total=0;
		for(int i=0;i<n;i++) {
			total+= (int)(Math.random() * 6) + 1;
		}
		return total;
	}

}
