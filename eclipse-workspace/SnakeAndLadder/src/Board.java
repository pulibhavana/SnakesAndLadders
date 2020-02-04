

public class Board
{
	Snake snakes[]=new Snake[3];
	Ladder ladder[]=new Ladder[3];
	int winningPosition=30;
	
	Board()
	{
		initializeTheSnakes();
		initializeTheLadders();
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
		int move = playerObject.currentPosition+position;
		if(move > winningPosition)
			System.out.println("can't move");
		else
		{
			playerObject.currentPosition+=position;
			System.out.print(playerObject.counterColor+"current position is");
			System.out.println(playerObject.currentPosition);
		}
		
	}
	
	public void checkForSnake(Player playerObject)
	{
		for(int index = 0;index < 3;index++)
		{
			boolean result;
			result=snakes[index].counterOnSnake(playerObject);
			if(result)
				break;
		}
	}
	
	public void checkForLadder(Player playerObject)
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
