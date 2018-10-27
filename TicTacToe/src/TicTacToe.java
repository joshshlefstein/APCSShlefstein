import java.util.Scanner;
public class TicTacToe {

		static char[] board= new char[9];
	
	public static void main(String[] args) {
		populateBoard();
		printBoard();
		playX();
		printBoard();
		playY();
		playerMoves();
		
	}
	
	
	public static void printBoard() {
		System.out.println(board[0]+" | "+board[1]+" | "+board[2]+"\n"
				+ 		   "---------\n"
				+ 		   board[3]+" | "+board[4]+" | "+board[5]+"\n"
				+ 		   "---------\n"
				+ 		   board[6]+" | "+board[7]+" | "+board[8]);
		
		
		if(board[0]==' ')System.out.println("board 0 empty");
	}
	
	public static void playX() {
		
	}
    
	public static void playY() {
		
	}
	public static void populateBoard() {
		for(int i = 0; i<board.length;i++)

			board[i] = ' ';
	}
	//2. user input for x's and O's and you want to print your board after each user inputs
	
	//3. checkWinner() method.
	
	public static void playerMoves() {
		int x=0;
		int y=0;
		int xcoordinate = 0;
		int ocoordinate = 0;
		while(x<1) {
			Scanner keyboard  = new Scanner(System.in);
		
		System.out.print("Choose X spot ===>>  ");										
		xcoordinate  = keyboard.nextInt();
		if(xcoordinate==1) {
			board[0]= 'x';
			x=1;
		}
		else if(xcoordinate==2) {
			board[1]= 'x';
			x=1;
		}
		else if(xcoordinate==3) {
			board[2]= 'x';
			x=1;
		}
		else
			System.out.println("invalid move");
		
		printBoard();
		}
		
		while(y<1) {
			Scanner keyboard  = new Scanner(System.in);
		System.out.println("Choose O spot ===>>  ");
		ocoordinate = keyboard.nextInt();
		if(ocoordinate==1 && xcoordinate==1) {
			System.out.println("Invalid");
			
			
		}
		else if(ocoordinate==1) {
			board[0]= 'o';
			y=1;
		}
		else
		System.out.println("invalid move");
		
		printBoard();
		}
		}
		
	}