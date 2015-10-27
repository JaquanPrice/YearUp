
import java.util.Scanner;
public class OddOrEven 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:\n");
		int a = sc.nextInt();
		sc.close();
		CalculateRemainder(a);
	}
	public static void CalculateRemainder(int a)
	{
		int r = a % 2;
		if (r != 0) 
		{
			System.out.println("Input is odd.");
		}
			else
			{
				System.out.println("Input is even.");
			}	
	}
}