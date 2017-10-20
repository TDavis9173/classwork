package boisIn2D;

import java.util.Arrays;

public class Main {

	public static void main(String [] args) {
		Array2DSampler test = new Array2DSampler();
	}

	private static void changeNeighbors(int[] arr, int i) {
		if(i==0 || i==arr.length-1) {
			if(i==0) {
			arr[i]++;
			arr[i+1]--;
			}
			if(i==arr.length-1) {
			arr[i]++;
			arr[i-1]--;
			}
			if(i==0 && i==arr.length-1) {
				arr[i]++;
			}
		}
		else {
			arr[i]++;
			arr[i+1]--;
			arr[i-1]--;
		}
		
	}

}
