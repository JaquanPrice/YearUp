
public class Circle {
	
	String m_color = null;
	double m_radius = -1;
					

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	{ 
		Circle bigCircle = new Circle(10);
		System.out.println("Big circle's radius is " + bigCircle.m_radius);
		System.out.println("Big circle's color is " + bigCircle.m_color);
		System.out.println("Big circle's area is " + bigCircle.CalculateArea());
		bigCircle.PrintColor();
		System.out.println();
		System.out.println();
		Circle smallCircle = new Circle(5,"red");
		System.out.println("Small circle's radius is " + smallCircle.m_radius);
		System.out.println("Small circle's color is " + smallCircle.m_color);
		System.out.println("Small circle's area is " + smallCircle.CalculateArea());
		smallCircle.PrintColor();
	}
	}
	
		Circle(int radius)
		{
			m_radius = radius;
			m_color = "grey";
				
		}
		
		Circle(int radius, String color){
			
			m_radius = radius;
			m_color = color;
			
		}
		
		double CalculateArea(){
		
			double Area = 3.14 * m_radius * m_radius;
			return Area;
			
		}
		
		void PrintColor()
		{
			System.out.println("My color is " + m_color);
		}
	}
			
			
		

