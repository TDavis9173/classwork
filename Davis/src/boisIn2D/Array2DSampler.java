package boisIn2D;

public class Array2DSampler {

	private String[][] pic;
	public Array2DSampler() {
		pic =new String[10][20];
		print(pic);
	}
	private void print(String[][] pic2) {
		for(int i=0;i<pic.length;i++) {
			for(int z=0;z<pic[i].length;z++) {
				System.out.print(pic[i][z]);
			}
			System.out.println("");
		}
		for(String[] row:pic) {
			for(String col:row) {
				System.out.print(col);
			}
			System.out.println("");
		}
	}

}
