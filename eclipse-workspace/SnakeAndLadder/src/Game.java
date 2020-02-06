import java.util.*;

public class Game 
{
	Player players[];
	Board board;
	Dice dice;
	int noOfPlayers,currentPlayerTurn = 0;
	
	Game()
	{
		board = new Board();
		dice = new Dice();
		players=getPlayerDetails();
	}
	
	public void startGame(){
		boolean gameEnds = false;
		while(!gameEnds)
		{
			Player currentPlayer = players[currentPlayerTurn];
			playgame(currentPlayer);
			if(hasWon(currentPlayer))
				gameEnds = true;
			currentPlayerTurn = getNextTurn();
		}
	
	}
	
	public void playgame(Player currentPlayer)
	{
		int number = currentPlayer.rollTheDice(dice);
		updateCounter(number, currentPlayer);
	}
	
	
	public int getNextTurn()
	{
		int nextTurn = (currentPlayerTurn + 1) % noOfPlayers;
		return nextTurn;
	}
	
	public Player[] getPlayerDetails()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of players");
		noOfPlayers=input.nextInt();
		players=new Player[noOfPlayers];
		for(int playerId = 0;playerId < noOfPlayers;playerId++)
			players[playerId]=new Player();
		return players;
	}
	
	
	public boolean hasWon(Player currentPlayer)
	{
		System.out.println(currentPlayer.getPlayerName()+" has won");
		return (currentPlayer.getPosition() == board.getWinningPosition());
			
	}
	
	public void updateCounter(int number,Player currentPlayer)
	{
		board.moveTheCounter(number,currentPlayer);
		board.checkForSnakes(currentPlayer);
		board.checkForLadders(currentPlayer);
	}
}
