import java.util.*;

public class Player 
{
	String counterColor,playername;
	int currentPosition;
	
	Player()
	{
		counterColor = getPlayerColor();
		currentPosition = 0;
	}
	
	public String getPlayerColor()
	{
		String color;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the name of player");
		playername = input.nextLine();
		System.out.println("Enter the color of"+playername);
		color = input.nextLine();
		return color;
	}
	
	public int rollTheDice(Dice diceObject)
	{
		int number;
		number = diceObject.getNumber();
		System.out.println("you rolled"+number);
		return number;
	}
}
