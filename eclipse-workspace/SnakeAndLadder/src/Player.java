import java.util.*;

public class Player 
{
	String counterColor,playerName;
	int position;
	
	Player()
	{
		counterColor = getPlayerColor();
		position = 0;
	}
	
	public String getPlayerColor()
	{
		String color;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the name of player");
		playerName = input.nextLine();
		System.out.println("Enter the color of"+playerName);
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
	
	public int getPosition()
	{
		return position;
	}
}
