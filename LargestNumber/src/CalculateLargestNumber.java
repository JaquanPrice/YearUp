
public class CalculateLargestNumber 
{

public static void main(String[] args)
{
	int[] numbersArray = new int[] {84, 3, 105, -103, 70, 36, -9};
	LargestNumberUsingWhileLoops(numbersArray);
	LargestNUmberUsingForLoops(numbersArray);
}
public static void LargestNumberUsingWhileLoops(int[] numbers)
{
	if (numbers != null)
	if (numbers.length > 0)
	{
		int i= 1;
		int largestnumber = numbers[0];
		
		while (i < numbers.length)
		{
			if (largestnumber < numbers[i])
			{
				largestnumber = numbers[i];
			}
			i++;
		}
		System.out.println("Largest NUmber using while loop is " + largestnumber);
	}
}
public static void LargestNUmberUsingForLoops(int[] numbers)
{
	if (numbers != null)
	if (numbers.length > 0)
	{
		int largestnumber = numbers[0];
		
		for (int i = 1; i < numbers.length; i++)
		{
			if (largestnumber < numbers[i])
			{
				largestnumber = numbers[i];
			}
		}
		System.out.println("Largest number using for loops is " + largestnumber);
	}
		
}
}