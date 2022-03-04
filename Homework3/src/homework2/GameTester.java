//supawit itthisiriwet
//6209650370
package homework2;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		GameMechanic game = new GameMechanic ();
		Scanner scan = new Scanner(System.in);
		System.out.printf("hello world\n");
		System.out.printf("Please choose the table size \ninput 1 for 3x3 \ninput 2 for 4x4\ninput 3 for 5x5\n");
		game.setBoard(scan.nextInt());
		game.getRow();
		game.getCol();
		System.out.printf("How many bomb you want in this match?\n");
		game.getBomb(scan.nextInt());
		game.createBoard();
		game.plantBomb();
		System.out.println();
		while(true) {
		System.out.println("Input row and column, for example : 0 0 = the first position of row and column");
		game.playerTurn(scan.nextInt(), scan.nextInt());
		game.checkMap();
		game.checkLife();
		game.comTurn();
		game.checkMap();
		game.checkLife();
		
		}
		
	}
	
}

