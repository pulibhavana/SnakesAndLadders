import java.util.*;

public class Snake 
{
	int startingPosition, endingPosition;
	
	Snake()
	{
		startingPosition = getStartingPosition();
		endingPosition = getEndingPosition();
	}
	
	public int getStartingPosition()
	{
		int input;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Snake starting position");
		input=in.nextInt();
		return input;
	}
	
	public int getEndingPosition()
	{
		int input;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Snake Ending position");
		input=in.nextInt();
		return input;
	}
	
	public boolean counterOnSnake(Player object)
	{
		if(object.position == startingPosition)
		{
			object.position = endingPosition;
			return true;
		}
		return false;
	}
}
