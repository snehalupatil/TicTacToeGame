import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	private char playerChoice;
	private char computerChoice;
	Scanner scan = new Scanner(System.in);
	char board[] = new char[10];

	// Creating Empty Board method
	private char[] creatBoard() {
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	// Show method is Created to Show the current board
	private void showBoard() {
		System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("-+-+-");
		System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("-+-+-");
		System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
	}

	// choose letter user and computer choice
	private char chooseLetter() {
		// taking user input
		System.out.println("Select the letter X or O:");
		char inputLetter = scan.next().charAt(0);
		if (inputLetter == 'X') {
			playerChoice = 'X';
			computerChoice = 'O';
		} else if (inputLetter == 'O') {
			playerChoice = 'O';
			computerChoice = 'X';
		} else
			System.out.println("Invalid symbol...."); // invalid Symbol
		return playerChoice;
	}

	// Ability for user to make a move to a desired location in the board
	private void makeMove() {
		System.out.println("Select the position from 1-9:");
		int positionSelector = scan.nextInt();
		switch (positionSelector) {
		case 1:
			board[1] = playerChoice;
			break;
		case 2:
			board[2] = playerChoice;
			break;
		case 3:
			board[3] = playerChoice;
			break;
		case 4:
			board[4] = playerChoice;
			break;
		case 5:
			board[5] = playerChoice;
			break;
		case 6:
			board[6] = playerChoice;
			break;
		case 7:
			board[7] = playerChoice;
			break;
		case 8:
			board[8] = playerChoice;
			break;
		case 9:
			board[9] = playerChoice;
			break;
		default:
			System.out.println("Invalid choice");
		}
		showBoard();
	}

	
	private void isFreeSpaceAvailable() {
		System.out.println("Enter Desired Location ");
		int location = scan.nextInt();
		switch (location) {
		case 1:
			if (board[1] == ' ') {
				board[1] = computerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 2:
			if (board[2] == ' ') {
				board[2] = computerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 3:
			if (board[3] == ' ') {
				board[3] = playerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 4:
			if (board[4] == ' ') {
				board[4] = playerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 5:
			if (board[5] == ' ') {
				board[5] = playerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 6:
			if (board[6] == ' ') {
				board[6] = playerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 7:
			if (board[7] == ' ') {
				board[7] = playerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 8:
			if (board[8] == ' ') {
				board[8] = playerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
			break;
		case 9:
			if (board[9] == ' ') {
				board[9] = playerChoice;
			} else {
				System.out.println("Position is Already occupied");
			}
		default:
			System.out.println("invalid position");
		}
	}

	private void checkToss() {
		Random rand = new Random();
		int toss = rand.nextInt(2);
		if (toss == 0) {
			System.out.println("Player is playing!!!");
		} else {
			System.out.println("Computer is playing!!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game!!"); 
		TicTacToe tictactoeboard = new TicTacToe(); 
		tictactoeboard.creatBoard(); 
		tictactoeboard.checkToss();
		tictactoeboard.chooseLetter(); 
		tictactoeboard.showBoard(); 
		tictactoeboard.makeMove();
		tictactoeboard.isFreeSpaceAvailable(); 
		tictactoeboard.makeMove(); 

	}

}