import java.util.*;

public class Ladder 
{
	int startingPosition,endingPosition;
	
	Ladder(int startPosition, int endPosition)
	{
		startingPosition = startPosition;
		endingPosition = endPosition;
	}
	
	
	
	public boolean isCounterOnLadder(Player player)
	{
		int playerPosition=player.getPosition();
		if(playerPosition == startingPosition)
		{
			player.position = endingPosition;
			return true;
		}
		return false;
	}
	
}
