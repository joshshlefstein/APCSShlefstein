import java.util.Scanner;

public class TTTattempt {
	
	static char[][] board= {
			{' ',' ',' '},
			{' ',' ',' '},
			{' ',' ',' '},
	};
	
	public static void main(String[] args) {
		System.out.println("Columns (0,1,2) and Rows (0,1,2).");
		System.out.println("0,0|0,1|0,2");
		System.out.println("-----------");
		System.out.println("1,0|1,1|1,2");
		System.out.println("-----------");
		System.out.println("2,0|2,1|2,2");
		System.out.println();
		
		printBoard();
		
		for(int i = 0; i<5; i++)
		{
			turns();
			
				
		}
	}
	
	public static void printBoard() {
		System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("---------");
		System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("---------");
		System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		System.out.println();
	}
	
	public static void turns() {
		playX();
		printBoard();
		checkWinner();
		playY();
		printBoard();
		checkWinner();
	}
	
	public static char playX() {
		System.out.println("Player X");
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Pick x coordinate -->  ");
		int x=keyboard.nextInt();
		System.out.print("Pick y coordinate -->  ");
		int y=keyboard.nextInt();
		
		if(board[x][y]=='x'||board[x][y]=='y') {
			System.out.println("Spot already taken, try again");
			playX();
		}
		else {
			return board[x][y]='x';
		}
		return board[x][y];
	}
	
	public static char playY() {
		System.out.println("Player Y");
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Pick x coordinate -->  ");
		int x=keyboard.nextInt();
		System.out.print("Pick y coordinate -->  ");
		int y = keyboard.nextInt();
		
		if(board[x][y]=='x'||board[x][y]=='y') {
			System.out.println("Spot already taken, try again");
			playY();
		}
		else {
			return board[x][y]='y';
		}
		return board[x][y];
	}
	
	public static void checkWinner() {
	int x=0;
//	while(x<1) {
//		if(board[0][0]=='x' && board[1][0]=='x' && board[2][0]=='x') {
//			System.out.println("Player X wins!");
//			x=1;
//			
//		}
//		
//		else if (board[0][0]=='y' && board[1][0]=='y' && board[2][0]=='y') {
//			System.out.println("Player Y wins!");
//			endGame();
//		}
//		
//		else if (board[0][1]=='x' && board[1][1]=='x' && board[2][1]=='x') {
//			System.out.println("Player X wins!");
//			endGame();
//		}
//		
//		else if (board[0][1]=='y' && board[1][1]=='y' && board[2][1]=='y') {
//			System.out.println("Player Y wins!");
//			endGame();
//		}
//		
//		else if (board[0][2]=='x' && board[1][2]=='x' && board[2][2]=='x') {
//			System.out.println("Player X wins!");
//			endGame();
//		}
//		
//		else if (board[0][2]=='y' && board[1][2]=='y' && board[2][2]=='y') {
//			System.out.println("Player Y wins!");
//			endGame();
//		}
//		
//		else if (board[0][0]=='x' && board[0][1]=='x' && board[0][2]=='x') {
//			System.out.println("Player X wins!");
//			endGame();
//		}
//		
//		else if (board[0][0]=='y' && board[0][1]=='y' && board[0][2]=='y') {
//			System.out.println("Player Y wins!");
//			endGame();
//		}
//		
//		else if (board[1][0]=='x' && board[1][1]=='x' && board[1][2]=='x') {
//			System.out.println("Player X wins!");
//			endGame();
//		}
//		
//		else if (board[1][0]=='y' && board[1][1]=='y' && board[1][2]=='y') {
//			System.out.println("Player Y wins!");
//			endGame();
//		}
//		
//		else if (board[2][0]=='x' && board[2][1]=='x' && board[2][2]=='x') {
//			System.out.println("Player X wins!");
//			endGame();
//		}
//		
//		else if (board[2][0]=='y' && board[2][1]=='y' && board[2][2]=='y') {
//			System.out.println("Player Y wins!");
//			endGame();
//		}
//		
//		else if (board[0][0]=='x' && board[1][1]=='x' && board[2][2]=='x') {
//			System.out.println("Player X wins!");
//			endGame();
//		}
//		
//		else if (board[2][2]=='y' && board[1][1]=='y' && board[2][0]=='y') {
//			System.out.println("Player Y wins!");
//			endGame();
//		}
//		
//		else {
//			
//		}
		
		for (int r = 0; r < 3; r++)
		{
				if(board[r][0]=='x' && board[r][1]=='x' && board[r][2]=='x') {
					System.out.println("Player X Wins!");
					break;
				}
				if(board[r][0]=='y' && board[r][1]=='y' && board[r][2]=='y') {
					System.out.println("Player Y Wins!");
					break;
					}
				
				break;
				
		}
		
		for (int c = 0; c < 3; c++)
		{
				if(board[0][c]=='x' && board[1][c]=='x' && board[2][c]=='x') {
					System.out.println("Player X Wins!");
					
				}
				if(board[0][c]=='y' && board[1][c]=='y' && board[2][c]=='y') {
					System.out.println("Player Y Wins!");
				
					}
				break;
				
		}
		
		for (int c = 0; c < 3; c++)
		{
			
				if((board[0][0]=='x' && board[1][1]=='x' && board[2][2]=='x')||
						(board[0][2]=='x' && board[1][1]=='x' && board[2][0]=='x')	) {
					System.out.println("Player X Wins!");
					
				}
				else if((board[0][0]=='y' && board[1][1]=='y' && board[2][2]=='y')||
						(board[0][2]=='y' && board[1][1]=='y' && board[2][0]=='y')) {
					System.out.println("Player Y Wins!");
					
					}
			
				
				break;
				
		}
	}
	
	

}
