
public class Main
{

public static void main(String[] args)
	{
		
		Person Me = new Person("Jaquan Price", "404.566.1008", "917 Stonewall dr", 20);
		System.out.println("I am " + Me.GetName());
		System.out.println("My phone number is " + Me.GetPhoneNumber());
		System.out.println("My address is " + Me.GetAddress());
		System.out.println("My age is " + Me.GetAge());
		int newAge = 0;
		System.out.println("Next year I will be " + Me.GrowsOlder(newAge));
		
	}

}
