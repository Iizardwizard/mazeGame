import java.util.Scanner;
import java.lang.Math;

public class Game {
	
	static boolean won = false;
	static String[][] board = new String[8][8];
	
	public static void clearBoard() {
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				board[i][j] = "o";
			}
		}
		board[0][0] = "x";
	}
	public static String showBoard() {
		
		String ret = "Health: " + Player.health;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				ret += board[i][j];
				ret += " ";
			}
			ret += "\n";
		}
		return ret;
	}
	
	static void setBoard(String diff) {
		int offset = 0;
		if(diff.toLowerCase().equals("easy")) {
			offset = 1;
		}else if(diff.toLowerCase().equals("medium")) {
			offset = 2;
		}else if(diff.toLowerCase().equals("hard")) {
			offset = 3;
		}else {
			return;
		}
		for(int i = 0; i < 5*offset; i++) {
			
			boolean done = false;
			
			while(done == false) {
				
				int x = (int)(Math.random()*8 - 0.5);
				int y = (int)(Math.random()*8 - 0.5);
				if(board[x][y].equals("o")) {
					done = true;
					board[x][y] = "^";
					
				}
			}
		}
	
	}
	
	public static void main(String[] args) {
		
		clearBoard();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the maze game. Please enter your name.");
		Player user = new Player(scan.nextLine());
		System.out.println("Please enter easy, medium, or hard to select a difficulty");
		setBoard(scan.nextLine());
		System.out.println(showBoard());

	}

}
