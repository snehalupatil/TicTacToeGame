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
	
	//choose letter user and computer choice
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

	public static void main(String[] args) {
		System.out.println("welcome to TicTacToe!!");         // Welcome message
		TicTacToe tictactoeboard = new TicTacToe();   // object creation
		tictactoeboard.creatBoard();                          // method call
		tictactoeboard.chooseLetter();                        // method call
	}
}