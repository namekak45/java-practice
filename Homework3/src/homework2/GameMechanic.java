//supawit itthisiriwet
//6209650370
package homework2;

import java.util.Random; 
public class GameMechanic {
	Random ran = new Random();
	private int playerLife=3,comLife=3,bomb;
	private int c1,c2;
	private int row,col;
	private boolean [][]foundBomb;
	private boolean [][]opened;
	private int [][]board;
	private int bombCount=0;
	private int z,m;
	
	public void setBoard(int choice) {
		if(choice==1) {
			board = new int [3][3];
			foundBomb = new boolean [3][3];
			opened = new boolean[3][3];
			row=3;
			col=3;
					
		} else if (choice ==2) {
			board = new int [4][4];
			foundBomb = new boolean [4][4];
			opened = new boolean[4][4];
			row=4;
			col=4;
		} else if (choice==3) {
			board = new int [5][5];
			foundBomb = new boolean [5][5];
			opened = new boolean[5][5];
			row=5;
			col=5;
		}
		}
	public int getRow(){
		return row;
	}
	public int getCol(){
		return col;
	}

	public int getBomb(int b) {
		bomb = b;
		return bomb;
	}
	public void createBoard() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.printf(" X ");
				foundBomb[i][j]=false;
				opened[i][j]=false;
			}
				System.out.printf("\n");
		}
	}

	public int playerTurn(int a,int b) {
		System.out.printf("------- Player Turn -------- \n");
		if(foundBomb[a][b]==true) {
			opened[a][b]=true;
			playerLife--;
			System.out.printf("Surprise! you got Bombed! your life is now:%d\n",playerLife);
		}else {
			opened[a][b]=true;
			System.out.printf("Nothing found , your life:%d\n",playerLife);
			
		}//comTurn();
		return playerLife;
	}
	public int comTurn() {
		c1 = ran.nextInt(row);
		c2 = ran.nextInt(col);
		
		if(opened[c1][c2]==true) {
			do {
				c1 = ran.nextInt(row);
				c2 = ran.nextInt(col);
			} while(opened[c1][c2]==true);
		}
		System.out.printf("------- Computer Turn -------- \n");
		System.out.printf("Computer choose row:%d ,col:%d \n",c1,c2);
		if(foundBomb[c1][c2]==true) {
			opened[c1][c2]=true;
			comLife--;
			System.out.printf("Surprise! you got Bombed! your life is now:%d\n",comLife);
		}else {
			opened[c1][c2]=true;
			System.out.printf("Nothing found ,computer's life:%d\n",comLife);
			
		}
		return comLife;
	}
	public void revealBomb() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			  if	(foundBomb[i][j]==false) {
				  System.out.printf(" - ");
			  	}
				  else { 
					  System.out.printf(" b ");
				  }
			  
			 
			}
			System.out.printf("\n");
		}
	}
	public void checkMap() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				if(opened[i][j]==true&&foundBomb[i][j]==false) {
					System.out.printf(" - ");
				}else if (opened[i][j]==false) {
					System.out.printf(" X ");
				} else if (foundBomb[i][j]==true&&opened[i][j]==true) {
					System.out.printf(" b ");
				}
			}
				System.out.printf("\n");
		}
	}
	public void checkLife() {
		int a=playerLife;
		int b= comLife;
		if (a==0) {
		System.out.printf("GAME OVER! COMPUTER WINS!\n");
		System.out.printf("----------BOMBs LOCATION IS----------\n");
		revealBomb();
		System.exit(0);
	} else if (b==0) {
		System.out.printf("GAME OVER! PLAYER WINS!\n");
		System.out.printf("----------BOMBs LOCATION IS----------\n");
		revealBomb();
		System.exit(0);
		
	
		}
	}
	public void plantBomb() {
		for(int i=0;i<=bomb;i++) {
			  int j = ran.nextInt(row);
			  int k = ran.nextInt(col);
			 foundBomb[j][k]=true;
			
			  
			  
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(foundBomb[i][j]==true) {
					bombCount++;
				}
			}
		}
		 if(bombCount<=bomb) {
			 do {for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						if(foundBomb[i][j]==true) {
							bombCount++;
							if (bombCount<=bomb) {
								for(int x=0;x<=bomb;x++) {
									  z = ran.nextInt(row);
									  m = ran.nextInt(col);
									 foundBomb[z][m]=true;
							}
						}
					}
				}
				 
			 
		 }
	}while(bombCount<bomb);
}
	}
}