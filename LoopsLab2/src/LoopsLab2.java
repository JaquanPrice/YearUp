
public class LoopsLab2 
{

	public static void main(String[] args)
	{
		int[] array1 = new int[] {40,60,80,100};
		int[] array2 = new int[] {40,50,80,100};
		int[] array3 = new int[] {40,60,80,60};
		System.out.println("Searching in Array 1 ... ");
		FindANumberInArray(array1, 60);
		System.out.println("searching in Array 2 ... ");
		FindANumberInArray(array2, 60);
		System.out.println("Finding all occurences in Array 2 ... ");
		FindOccurencesOfNumberInArray(array2, 60);
		System.out.println("Finding all occurences in Array 3 ... ");
		FindOccurencesOfNumberInArray(array3, 60);

	}
	
	public static void FindANumberInArray(int[] numbers, int searchNumber)
	{
		if(numbers != null)
		{
			int foundatlocation = -1;
			for (int i = 0; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					foundatlocation = i;
					break;
				}
			}
			if (foundatlocation >= 0)
			{
				System.out.println("The number was found at location " + foundatlocation);
			}
			else
			{
				System.out.println("The number was not found in the array");
			}
		}
	}
	public static void FindOccurencesOfNumberInArray(int[] numbers, int searchNumber)
	{
		if(numbers != null)
		{
			int numberofoccurences = 0;
			for (int i = 0; i < numbers.length; i++)
			{
				if (numbers[i] == searchNumber)
				{
					numberofoccurences++;
				}
			}
				System.out.println(searchNumber + " was found " + numberofoccurences + " times in the array");
	
		}
	}

}
