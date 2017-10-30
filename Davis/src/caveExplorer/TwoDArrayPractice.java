package caveExplorer;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		String[][] pic = new String[6][10];
		for (String[] row:pic) {
			for (int col = 0; col<row.length;col++) {
				row[col] = " ";
			}
		}
		//drawHorizontalLine(pic,2);
		//drawVeritcalLine(pic,3);
		//drawSlot(pic,4,6);
		drawBox(pic,5,8);
		print (pic);
	}

	private static void drawBox(String[][] pic, int i, int j) {
			drawSlot(pic,i,j);
			drawSlot(pic,i+1,j);
			drawAt("_",pic,i+1,j);
			for(int col = j-1;col <=j+1;col++) {
				drawAt("-",pic,i,col);
			}
	}
		
	

	private static void drawAt(String string,String[][] pic, int i, int j) {
		if(i>0 && i<pic.length) {
			if(j>0 && j>pic[i].length) {
				pic[i][j]=string;
			}
		}
		
	}

	private static void drawSlot(String[][] pic, int i, int j) {
		if(i>0 && i<pic.length) {
		if(j>0) {
			pic[i][j-1]="|";
		}
			if( j<pic[i].length-1) {
				pic[i][j+1]="|";
			}	
		}
	}

	private static void drawVeritcalLine(String[][] pic, int col) {
		for(int i=0;i<pic.length;i++) {
			pic[i][col]="|";
		}
		
	}

	private static void drawHorizontalLine(String[][] pic, int row) {
		for(int i=0;i<pic[row].length;i++) {
			pic[row][i]="-";
		}
		
	}

	private static void print(String[][] pic) {
		for(int i=0;i<pic.length;i++) {
			System.out.println(getRow(pic,i));
		}
		
	}

	private static String getRow(String[][] pic, int row) {
		String z ="";
		for(int i =0;i<pic[row].length;i++) {
		z+=pic[row][i];
		}
		return z;
	}
}
