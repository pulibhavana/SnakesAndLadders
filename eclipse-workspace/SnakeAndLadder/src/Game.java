import java.lang.reflect.Array;
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
		players=getPlayers();
	}
	
	public void startGame(){
		boolean gameEnds = false;
		while(!gameEnds)
		{
			Player currentPlayer = players[currentPlayerTurn];
			playgame(currentPlayer);
			if(hasWon(currentPlayer))
			{
				System.out.println(currentPlayer.getPlayerName()+" has won");
				gameEnds = true;
			}
			currentPlayerTurn = getNextTurn();
		}
	
	}
	
	public void playgame(Player currentPlayer)
	{
		int number = currentPlayer.rollTheDice(dice);
		System.out.println("you rolled "+ number);
		updateColor(number, currentPlayer);
	}
	
	
	public int getNextTurn()
	{
		int nextTurn = (currentPlayerTurn + 1) % noOfPlayers;
		return nextTurn;
	}
	
	public Player[] getPlayers()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of players");
		noOfPlayers=input.nextInt();
		Player playersDetails[] = new Player[noOfPlayers];
		for(int playerId = 0; playerId < noOfPlayers; playerId++)
			playersDetails[playerId]=new Player();
		return playersDetails;
	}
	
	
	public boolean hasWon(Player currentPlayer)
	{
		return (currentPlayer.getPosition() == board.getWinningPosition());
	}
	
	public void updateColor(int number,Player currentPlayer)
	{
		int updatedPosition; Snake snake; Ladder ladder;
		updatedPosition = board.moveTheColor(number,currentPlayer);
		snake = board.checkForSnakes(updatedPosition);
		if(snake!=null)
			currentPlayer.position = snake.getEndingPosition();
		ladder = board.checkForLadders(updatedPosition);
		if(ladder!=null)
			currentPlayer.position = ladder.getEndingPosition();
	}
}
