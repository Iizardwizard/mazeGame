public class Player {
	static int health = 3;
	static int xCoord = 0;
	static int yCoord = 0;
	private String playerName = "";
	
	public Player() {
		playerName = "Player";
	}
		
	public Player(String name) {
		playerName = name;
	}
		
	public void takeDamage(double damage) {
		health -= damage;
	}
	public void move(String dir) {
		int tempX = xCoord;
		int tempY = yCoord;
		if(dir.toLowerCase().equals("up")){
			tempY++;
		}else if(dir.toLowerCase().equals("down")) {
			tempY--;
		}else if(dir.toLowerCase().equals("left")) {
			tempX--;
		}else if(dir.toLowerCase().equals("right")) {
			tempX++;
		}else {
			System.out.println("Invalid Input");
		}
	}
}
