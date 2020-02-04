import java.util.*;

public class Snake 
{
	int startingPosition,endingPosition;
	
	Snake()
	{
		getPositions();
	}
	
	public void getPositions()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Snake starting and ending positions");
		startingPosition=input.nextInt();
		endingPosition=input.nextInt();
	}
	
	public boolean counterOnSnake(Player object)
	{
		if(object.currentPosition==startingPosition)
		{
			object.currentPosition=endingPosition;
			return true;
		}
		return false;
	}
}
