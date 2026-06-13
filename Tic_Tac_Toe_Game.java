import java.util.Scanner;

public class Tic_Tac_Toe_Game {
	static char[][] board = new char[3][3];
	
	public static void initializeBoard() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '.';
			}
		}
	}
	
	public static void printBoard() {
		System.out.println("\n       -------- Board --------");
		for (int i = 0; i < 3; i++) {
			System.out.print("	        ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("       -----------------------");
	}
	
	public static boolean checkWin(char player) {
		for (int i = 0; i < 3; i++) {
			if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}
		
		if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}
		
		if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(board[i][j] == '.') {
					return false;
				}
			}
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char playAgain;
		
		System.out.println("********** Tic-Tac-Toe Game **********");
		do {
			initializeBoard();
			char player = 'X';
			
			boolean gameOver = false;
			
			while(!gameOver) {
				printBoard();
				System.out.println("Player " + player + " enter row and column (0-2): ");
				System.out.print("-> Row: ");
				int row = scanner.nextInt();
				System.out.print("-> Col: ");
				int col = scanner.nextInt();
				
				if(board[row][col] == '.') {
					board[row][col] = player;
				}
				else {
					System.out.println("Cell already taken! Try again");
					continue;
				}
				
				if(checkWin(player)) {
					printBoard();
					System.out.println("Player " + player + " wins!");
					gameOver = true;
				}
				else if(isDraw()) {
					printBoard();
					System.out.println("Game is Draw!"); 
					gameOver = true;
				}
				else {
					player = (player == 'X') ? 'O' : 'X';
				}
				
			}
			
			System.out.print("Play again? (y/n): ");
			playAgain = scanner.next().charAt(0);
			
		} while(playAgain == 'y' || playAgain == 'Y');
		
		scanner.close();
		System.out.println("Thanks for playing!");
	}
	
}
