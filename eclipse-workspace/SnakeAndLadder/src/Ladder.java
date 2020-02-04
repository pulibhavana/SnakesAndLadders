import java.util.*;

public class Ladder 
{
	int startingPoint,endingPoint;
	
	Ladder()
	{
		getpoints();
	}
	
	public void getpoints()
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the ladder starting and ending point");
		startingPoint=input.nextInt();
		endingPoint=input.nextInt();
	}
	
	public boolean counterOnLadder(Player playerObject)
	{
		if(playerObject.currentPosition==startingPoint)
		{
			playerObject.currentPosition=endingPoint;
			return true;
		}
		return false;
	}
	
}
