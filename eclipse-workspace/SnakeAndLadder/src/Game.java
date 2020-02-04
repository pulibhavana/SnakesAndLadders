import java.util.*;

public class Game 
{
	Player player[];
	Board board;
	Dice dice;
	int noOfPlayers,turn = 0;
	
	Game()
	{
		board = new Board();
		dice = new Dice();
	}
	
	public void startGame()
	{
		playerInformation();
		for(turn = 0; ;turn=whoseNextTurn())
		{
			Player currentPlayer = player[turn];
			System.out.println(player[turn].counterColor+" 's turn");
			int number=player[turn].rollTheDice(dice);
			updateCounter(number,player[turn]);
			if(hasWon(currentPlayer))
				break;
		}
		System.out.println("Game over");
	
	}
	
	public int whoseNextTurn()
	{
		int nextTurn;
		nextTurn=(++turn)%noOfPlayers;
		return nextTurn;
	}
	
	public void playerInformation()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of players");
		noOfPlayers=input.nextInt();
		player=new Player[noOfPlayers];
		for(int playerNumber = 0;playerNumber < noOfPlayers;playerNumber++)
			player[playerNumber]=new Player();
	}
	
	
	public boolean hasWon(Player currentPlayer)
	{
			if(currentPlayer.getPosition() == board.getWinningPosition())
			{
				System.out.println(currentPlayer.playerName+" is Winner");
				return true;
			}
			return false;
	}
	
	public void updateCounter(int number,Player player)
	{
		board.moveTheCounter(number,player);
		board.checkForSnakes(player);
		board.checkForLadders(player);
	}
}
