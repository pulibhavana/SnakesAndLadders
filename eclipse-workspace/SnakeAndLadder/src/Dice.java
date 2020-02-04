import java.lang.Math;

public class Dice 
{
	int number;
	
	public int displayNumber()
	{
		number=(int)(6.0*Math.random());
		System.out.println("you rolled"+number);
		return number;
	}
}
