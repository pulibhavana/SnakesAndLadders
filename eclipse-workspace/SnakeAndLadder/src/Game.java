import java.util.*;

public class Game 
{
	Player player[];
	Board boardObject;
	Dice dice;
	int noOfPlayers;
	
	Game()
	{
		playerInformation();
		boardObject = new Board();
		dice = new Dice();
	}
	
	public void startGame()
	{
		int index, number=0;
		for(index = 0;!gameEnds();index = (++index)%noOfPlayers)
		{
			System.out.println(player[index].counterColor+" 's turn");
			number=player[index].rollTheDice(dice);
			updateCounter(number,player[index]);
		}
		System.out.println("Game over");
	
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
	
	
	public boolean gameEnds(){
		for(int index = 0;index < noOfPlayers;index++)
		{
			if(player[index].currentPosition == boardObject.winningPosition)
			{
				System.out.println(player[index].counterColor+" is Winner");
				return true;
			}
		}
		return false;
	}
	
	public void updateCounter(int number,Player player)
	{
		boardObject.moveTheCounter(number,player);
		boardObject.checkForSnake(player);
		boardObject.checkForLadder(player);
	}
	
	
}
