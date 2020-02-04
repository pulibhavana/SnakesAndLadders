import java.lang.Math;

public class Dice 
{
	int number;
	
	public int getNumber()
	{
		number = (int)(6.0 * Math.random());
		return number;
	}
}
