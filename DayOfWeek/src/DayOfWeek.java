
import java.util.Scanner;
public class DayOfWeek 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new day of week:\n ");
		String Day = sc.nextLine();
		sc.close();
		
		EvaluateDayOfWeek(Day);
		
	
	}
	
		
	public static void EvaluateDayOfWeek(String Day)
	{
		if (Day != null)
		{
			if (!Day.isEmpty())
			{
				if (Day.equalsIgnoreCase("Monday")
						|| Day.equalsIgnoreCase("Tuesday")
						|| Day.equalsIgnoreCase("Wednesday")
						|| Day.equalsIgnoreCase("Thursday")
						|| Day.equalsIgnoreCase("Friday")) 
				{
					System.out.println("You have to go to work. It's a weekday.");
				} 
				else
					if (Day.equalsIgnoreCase("Saturday")
							|| (Day.equals("Sunday")))
					{
					System.out.println("Take the day off. It's the weekend");
					}
			}
		}	
		System.out.println("Invalid Entry.");
	}
}
	