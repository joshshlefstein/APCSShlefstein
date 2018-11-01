import java.util.Scanner;
public class TicTacToe {

	static char[] board= {'0','1','2','3','4','5','6','7','8'};
	
	public static void main(String[] args) {
		printBoard();
		
		boolean winner=false;
		char checkW;
		while(winner==false) {
			playX();
			printBoard();
			checkW=checkWinner();
			if(checkW=='X'||checkW=='O'||checkW=='T') {
				winner=true;
				System.out.println("\n"+ checkW+ " Wins!");
			}
			
			else {
				playO();
				printBoard();
				checkW=checkWinner();
				if(checkW=='X'||checkW=='O'||checkW=='T') {
					winner=true;
					System.out.println("\n"+ checkW + " Wins!");
				}			
			}
		}
	}
	
	public static void printBoard() {
		System.out.println(board[0]+" | "+board[1]+" | "+board[2]+"\n"
				+ 		   "----------\n"
				+ 		   board[3]+" | "+board[4]+" | "+board[5]+"\n"
				+ 		   "----------\n"
				+ 		   board[6]+" | "+board[7]+" | "+board[8]);
	}
		
	public static void playX() {
		System.out.println("\nPlayer X");
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Pick spot --> ");
		int x=keyboard.nextInt();
		System.out.println("\n");
		
		if(board[x]=='X'||board[x]=='O') {
			System.out.println("Spot already taken, try again");
			playX();
		}
		
		else {
			board[x]='X';
		}	
	}
	
	public static void playO() {
		System.out.println("\nPlayer O");
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Pick spot --> ");
		int x=keyboard.nextInt();
		System.out.println("\n");
		
		if(board[x]=='X'||board[x]=='O') {
			System.out.println("Spot already taken, try again");
			playO();
		}
		else {
			board[x]='O';
		}
	}
	
	public static char checkWinner() {
		String line1= ""+board[0]+board[1]+board[2];
		String line2= ""+board[3]+board[4]+board[5];
		String line3= ""+board[6]+board[7]+board[8];
		String line4= ""+board[0]+board[1]+board[2];
		String line5= ""+board[0]+board[3]+board[6];
		String line6= ""+board[1]+board[4]+board[7];
		String line7= ""+board[2]+board[5]+board[8];
		String line8= ""+board[0]+board[4]+board[8];
		String line9= ""+board[2]+board[4]+board[6];
	
		if(line1.equals("XXX"))
			return 'X';
		else if(line1.equals("OOO")) 
			return'O';
		
		else if(line2.equals("XXX")) 
			return 'X';
		else if(line2.equals("OOO")) 
			return'O';
			
		else if(line3.equals("XXX")) 
			return 'X';
		else if(line3.equals("OOO")) 
			return'O';
			
		else if(line4.equals("XXX")) 
			return 'X';
		else if(line4.equals("OOO")) 
			return'O';
			
		else if(line5.equals("XXX")) 
			return 'X';
		else if(line5.equals("OOO")) 
			return'O';
			
		else if(line6.equals("XXX")) 
			return 'X';
		else if(line6.equals("OOO")) 
			return'O';
			
		else if(line7.equals("XXX")) 
			return 'X';
		else if(line7.equals("OOO")) 
			return'O';
			
		else if(line8.equals("XXX")) 
			return 'X';
		else if(line8.equals("OOO")) 
			return'O';
			
		else if(line9.equals("XXX")) 
			return 'X';
		else if(line9.equals("OOO")) 
			return'O';
			
		int counter=0;
		for(int k=0; k<board.length;k++) {
			if (board[k]=='X' || board[k]=='O') {
				counter++;
			}
		}
		if(counter==9) {
			return 'T';
		}
		
		return ' ';
	}
}