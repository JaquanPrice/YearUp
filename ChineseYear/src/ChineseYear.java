import java.util.Scanner;

public class ChineseYear {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year:");

		int inputYear = sc.nextInt();

		EvaluateChineseYear(inputYear);

		sc.close();

		}

		private static void EvaluateChineseYear(int inputYear)

		{

		int yearDifference = inputYear - 1900;

		int remainder = yearDifference % 12;

		switch(remainder)

		{

		case 0:

		System.out.println(inputYear + " is the year of the Rat");

		break;

		case 1:

		System.out.println(inputYear + " is the year of the Ox");

		break;

		case 2:

		System.out.println(inputYear + " is the year of the Tiger");

		break;

		case 3:

		System.out.println(inputYear + " is the year of the Rabbit");

		break;

		case 4:

		System.out.println(inputYear + " is the year of the Dragon");

		break;

		case 5:

		System.out.println(inputYear + " is the year of the Snake");

		break;

		case 6:

		System.out.println(inputYear + " is the year of the Horse");

		break;

		case 7:

		System.out.println(inputYear + " is the year of the Sheep");

		break;

		case 8:

		System.out.println(inputYear + " is the year of the Monkey");

		break;

		case 9:

		System.out.println(inputYear + " is the year of the Rooster");

		break;

		case 10:

		System.out.println(inputYear + " is the year of the Dog");

		break;

		case 11:

		System.out.println(inputYear + " is the year of the Pig");

		break;

		default:

		System.out.println("I can’t calculate the Chinese year for" + inputYear);

		}

		}	
	}


