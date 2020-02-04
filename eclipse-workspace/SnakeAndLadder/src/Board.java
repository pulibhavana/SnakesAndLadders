

public class Board
{
	Snake snakes[]=new Snake[3];
	Ladder ladder[]=new Ladder[3];
	int winningPosition;
	
	Board()
	{
		initializeTheSnakes();
		initializeTheLadders();
	}
	
	public int getWinningPosition()
	{
		winningPosition = 30;
		return winningPosition;
	}
	
	public void initializeTheSnakes()
	{
		for(int index = 0;index < 3;index ++)
			snakes[index] = new Snake();
	}
	
	public void initializeTheLadders()
	{
		for(int index = 0;index < 3;index ++)
			ladder[index] = new Ladder();
	}
	
	
	public void moveTheCounter(int position,Player playerObject){
		int move = playerObject.position+position;
		if(move > winningPosition)
			System.out.println("can't move");
		else
		{
			playerObject.position+=position;
			System.out.print(playerObject.counterColor+"current position is");
			System.out.println(playerObject.position);
		}
		
	}
	
	public void checkForSnakes(Player playerObject)
	{
		for(int index = 0;index < 3;index++)
		{
			boolean result;
			result=snakes[index].counterOnSnake(playerObject);
			if(result)
				break;
		}
	}
	
	public void checkForLadders(Player playerObject)
	{
		for(int index = 0;index < 3;index++)
		{
			boolean result;
			result=ladder[index].counterOnLadder(playerObject);
			if(result)
				break;
		}
	}

	
}
