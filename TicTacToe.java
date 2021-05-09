public class TicTacToe {
	
	public char[] creatBoard() 
	{   
		char board[] = new char[10];
		for (int i = 1; i < board.length; i++) 
		{
			board[i] = ' ';
		}
		return board;
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome to TicTacToe Game!!");//Welcome message
		TicTacToe obj = new TicTacToe();//object creation
		obj.creatBoard();
	}
}