
public class Person 
{
		public String m_name;
		public int m_age;
		public String m_phonenumber;
		public String m_address;
		
		public Person(String Name, String PhoneNumber, String Address, int Age)
		{
			m_name = Name;
			m_phonenumber = PhoneNumber;
			m_address = Address;
			m_age = Age;
		}
		
		public String GetName()
		{
			return m_name;
		}
		public void SetName(String Name)
		{
			m_name = Name;
		}
		public int GetAge()
		{
			return m_age;
		}
		public void SetAge(int Age)
		{
			m_age = Age;
		}
		public String GetPhoneNumber()
		{
			return m_phonenumber;
		}
		public void SetPhoneNumber(String PhoneNumber)
		{
			m_phonenumber = PhoneNumber;
		}
		
		public String GetAddress()
		{
			return m_address;
		}
		public void SetAddress(String Address)
		{
			m_phonenumber = Address;
		}		
		
	public int GrowsOlder(int newAge)
	{
		return newAge = m_age + 1;
	}
}





