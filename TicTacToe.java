import java.util.Scanner;

public class TicTacToe {
	public String playerChoice;
	public String computerChoice;
	char board[] = new char[10];

	// Creating Empty Board method
	public char[] creatBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// choose letter user and computer choice
	public String chooseLetter() {
		Scanner letter = new Scanner(System.in); // taking user input
		System.out.println("Enter the letter X-O:");
		String inputLetter = letter.nextLine();
		if (inputLetter.equals("X")) {
			playerChoice = "X";
			computerChoice = "O";
		} else if (inputLetter.equals("O")) {
			playerChoice = "O";
			computerChoice = "X";
		} else
			System.out.println("Invalid symbol...."); // invalid Symbol
		letter.close();

		return playerChoice;
	}

	// Show method is Created to Show the current board
	public void showBoard() {
		System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("-+-+-");
		System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("-+-+-");
		System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
	}

	public static void main(String[] args) {
		System.out.println("welcome to TicTacToe!!"); // Welcome message
		TicTacToe tictactoeboard = new TicTacToe(); // object creation
		tictactoeboard.creatBoard(); // method call
		tictactoeboard.chooseLetter(); // method call
		tictactoeboard.showBoard(); // method call
	}
}