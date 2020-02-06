import java.util.*;

public class Snake 
{
	int startingPosition, endingPosition;
	
	Snake(int startPosition,int endPosition)
	{
		startingPosition = startPosition;
		endingPosition = endPosition;
	}
	
	public int getStartingPosition()
	{
		return startingPosition;
	}
	
	public int getEndingPosition()
	{
		return endingPosition;
	}
}

