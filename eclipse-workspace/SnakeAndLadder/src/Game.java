import java.util.*;

public class Game 
{
	Player player[];
	Board boardObject;
	Dice dice;
	int noOfPlayers;
	
	Game()
	{
		boardObject=new Board();
		dice=new Dice();
	}
	
	public void startGame()
	{
		Scanner input=new Scanner(System.in);
		int turn=0,index;
		System.out.println("Enter number of players");
		noOfPlayers=input.nextInt();
		player=new Player[noOfPlayers];
		for(int playerNumber=0;playerNumber<noOfPlayers;playerNumber++)
			player[playerNumber]=new Player();
		
		for(index=0;!gameEnds();index=(turn++)%noOfPlayers)
		{
			int number=0;
			String value;;
			System.out.println(player[index].counterColor+" 's turn");
			System.out.println("enter roll to roll the dice");
			value=input.nextLine();
			if(value=="roll")
			{
				number=player[index].rollTheDice(dice);
			}
			boardObject.moveTheCounter(number,player[index]);
		}
		
		System.out.println("Game over");
	
		
	}
	
	public boolean gameEnds()
	{
		for(int index=0;index<noOfPlayers;index++)
		{
			if(player[index].currentPosition==boardObject.winningPosition)
			{
				System.out.println(player[index].counterColor+" is Winner");
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		Game snakeAndLadder=new Game();
		snakeAndLadder.startGame();
	}
}
