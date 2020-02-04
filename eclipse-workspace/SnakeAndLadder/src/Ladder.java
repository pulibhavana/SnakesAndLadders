import java.util.*;

public class Ladder 
{
	int startingPoint,endingPoint;
	
	Ladder()
	{
		startingPoint = getStartingPoint();
		endingPoint = getEndingPoint();
	}
	
	public int getStartingPoint()
	{
		int input;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ladder starting point");
		input = in.nextInt();
		return input;
	}
	
	public int getEndingPoint()
	{
		int input;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the ladder ending point");
		input = in.nextInt();
		return input;
		
	}
	
	public boolean counterOnLadder(Player playerObject)
	{
		if(playerObject.currentPosition == startingPoint)
		{
			playerObject.currentPosition = endingPoint;
			return true;
		}
		return false;
	}
	
}
