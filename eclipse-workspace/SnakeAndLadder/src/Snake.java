import java.util.*;

public class Snake 
{
	int startingPosition, endingPosition;
	
	Snake(int startPosition,int endPosition)
	{
		startingPosition = startPosition;
		endingPosition = endPosition;
	}
	
	public boolean isCounterOnSnake(Player player)
	{
		if(player.getPosition() == startingPosition)
		{
			player.position = endingPosition;
			return true;
		}
		return false;
	}
}

