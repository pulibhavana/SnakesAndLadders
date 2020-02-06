

public class Board
{
	Snake snakes[]=new Snake[3];
	Ladder ladder[]=new Ladder[4];
	int winningPosition;
	
	Board()
	{
		snakes[0] = new Snake(27,1);
		snakes[1] = new Snake(21,9);
		snakes[2] = new Snake(17,4);
		ladder[0] = new Ladder(3,22);
		ladder[1] = new Ladder(5,8);
		ladder[2] = new Ladder(11,26);
		ladder[3] = new Ladder(20,29);
	}
	
	public int getWinningPosition()
	{
		winningPosition = 30;
		return winningPosition;
	}
	
	public void moveTheCounter(int position,Player player)
	{
		int move = player.position+position;
		if(move > winningPosition)
			System.out.println("can't move");
		else
		{
			player.position+=position;
			System.out.print(player.counterColor+"current position is");
			System.out.println(player.position);
		}
		
	}
	
	public void checkForSnakes(Player player)
	{
		for(int index = 0;index < 3;index++)
		{
			boolean result;
			result=snakes[index].isCounterOnSnake(player);
			if(result)
				break;
		}
	}
	
	public void checkForLadders(Player player)
	{
		for(int index = 0;index < 3;index++)
		{
			boolean result;
			result=ladder[index].isCounterOnLadder(player);
			if(result)
				break;
		}
	}

	
}
