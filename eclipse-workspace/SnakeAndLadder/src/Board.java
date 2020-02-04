

public class Board
{
	Snake snakes[]=new Snake[3];
	Ladder ladder[]=new Ladder[3];
	int winningPosition=30;
	
	Board()
	{
		for(int index=0;index<3;index++)
		{
			snakes[index]=new Snake();
		}
		for(int index=0;index<3;index++)
		{
			ladder[index]=new Ladder();
		}
	}
	
	public void moveTheCounter(int position,Player playerObject)
	{
		int validmove=playerObject.currentPosition+position;
		if(validmove>winningPosition)
		{
			System.out.println("can't move");
		}
		else
		{
			playerObject.currentPosition+=position;
			System.out.println(playerObject.counterColor+"current position is"+playerObject.currentPosition);
		}
		
		for(int index=0;index<3;index++)
		{
			boolean result;
			result=snakes[index].counterOnSnake(playerObject);
			if(result)
				break;
		}
		
		for(int index=0;index<3;index++)
		{
			boolean result;
			result=ladder[index].counterOnLadder(playerObject);
			if(result)
				break;
		}
		
	}

	
}
