

public class Board
{
	Snake snakes[]=new Snake[3];
	Ladder ladders[]=new Ladder[4];
	int winningPosition;
	
	Board()
	{
		snakes[0] = new Snake(27,1);
		snakes[1] = new Snake(21,9);
		snakes[2] = new Snake(17,4);
		ladders[0] = new Ladder(3,22);
		ladders[1] = new Ladder(5,8);
		ladders[2] = new Ladder(11,26);
		ladders[3] = new Ladder(20,29);
		winningPosition = 30;
	}
	
	public int getWinningPosition()
	{
		return winningPosition;
	}
	
	public int moveTheColor(int number,Player player)
	{
		int currentPosition = player.getPosition() + number;
		
		if(!isValidMove(currentPosition))
				System.out.println("can't move");
				
		else
		{
			player.position = currentPosition;
		}
		return player.position;
	}
	
	public boolean isValidMove(int position)
	{
		return(position <= winningPosition);
			
	}
	
	public Snake checkForSnakes(int position)
	{
	    Snake snake = null ;
		for(int index = 0;index < 3;index++)
		{
			if(position == snakes[index].getStartingPosition())
				snake = snakes[index];
		}
		return snake;
		
	}
	
	public Ladder checkForLadders(int position)
	{
		Ladder ladder = null;
		for(int index = 0;index < 3;index++)
		{
			if(position == ladders[index].getStartingPosition())
				ladder = ladders[index];
		}
		return ladder;
	}
}
