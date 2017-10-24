package caveExplorer;

public class CaveRoom {

	private String description;
	private String directions;
	private String contents;
	private String defaultContents;
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		borderingRooms =new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}
	public void setDirections() {
		directions="";
		boolean doorFound =false;
		for(int i=0;i<4;i++) {
			if(doors[i] != null) {
				doorFound = true;
				directions +="There is a" +doors[i].getDescription()+ "to the"+ toDirection(i)+"."+doors[i].getDetails()+"\n";
			}
		if(!doorFound) {
			directions = "Ur traped";
		}
		}
	}
	public static String toDirection(int dir) {
		if(dir==0||dir==1||dir==2||dir==3) {
			String[] z= new String[4];
			z[0] = "North";
			z[1] = "East";
			z[2] = "South";
			z[3]= "West";
		return z[dir];
		}
		else return "waitWut";
	}
	public void enter() {
		contents = "X";
	}
	public void leave() {
		contents = defaultContents;
	}
	public void setConnection(int direction,CaveRoom anotherRoom,Door door) {
		addRoom(direction, anotherRoom,door);
		anotherRoom.addRoom(oppositeDirection(direction),this,door);
	}
	public void addRoom(int dir, CaveRoom caveRoom, Door door) {
		borderingRooms[dir] = caveRoom;
		doors[dir] = door;
		setDirections();
		
	}
	public void interpretInput(String input) {
		while(!isValid(input)) {
			System.out.println("you can only enter 'w','a','s',or'd'");
			input = CaveExplorer.in.nextLine();
		}
		int direction = "wdsa".indexOf(input);
		goToRoom(direction);
	}
	private boolean isValid(String input) {
	
		return "wasd".indexOf(input) != -1 && input.length()==1;
	}
	//where you edit caves
	public static void setUpCaves() {
		
	}
	public void goToRoom(int direction) {
		if(borderingRooms[direction] !=null && doors[directions] != null && doors[direction].isOpen()) {
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}else {
			System.err.println("you can't do that");
		}
	}
	public static int oppositeDirection(int dir) {
		return (dir+2)%4;
	}
	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

}
