package caveExplorer;

public class NPC {
	private CaveRoom[][] floor;
	private int currentRow;
	private int currentCol;
	private NPCRoom currentRoom;
	private boolean active;
	private String activeDescription;
	private String inactiveDescription;
	public NPC() {
		this.floor = CaveExplorer.caves;
		this.activeDescription = "There is a person standing in the room, waiting to talk to you. Press f to talk.";
		this.inactiveDescription = "The person you spoke to earlier is standing here.";
		this.currentCol = -1;
		this.currentRow = -1;
		currentRoom = null;
		active = true;
	}

	public boolean isActive() {
		return active;
	}

	public void interact() {
		CaveExplorer.print("lets talk type bye to stop");
		String s = CaveExplorer.in.nextLine();
		while (!s.equalsIgnoreCase("bye")) {
			CaveExplorer.print("ok dad");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("Lata nerd");
		active = false;
	}

	public String getDescription() {
		return activeDescription;
	}

	public String getInactiveDescription() {
		return inactiveDescription;
	}

	public String getSymbol() {
		return "P";
	}

	public void setPosition(int i, int j) {
		if(i>=0 && i<floor.length && j>=0 && j<floor[i].length &&floor[i][j] instanceof NPCRoom) {
			if(currentRoom != null) {
				currentRoom.leaveNPC();
			}
			currentRow = i;
			currentCol= j;
			currentRoom = (NPCRoom)floor[i][j];
			currentRoom.enterNPC(this);
		}
	}

	public void autoMove() {
		if(active) {
			int[] move = calculateMove();
			int newRow = currentRow + move[0];
			int newCol = currentCol + move[1];
			setPosition(newRow,newCol);
		}
		
	}

	private int[] calculateMove() {
		int[][] posibleMoves = {{-1,0},{0,1},{1,0},{0,-1}};
		int index =
	}	
}

