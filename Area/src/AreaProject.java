
public class AreaProject {
public static void main(String args[]){
	double c= AC(6);
	double r = AR(3, 8);
	
	System.out.println("Area of the circle is " + c + " " + "Area of the rectangle is " + r);
}
public static double AC(double radius){
	
	double A =3.14*radius*radius;
	return A;
}
public static double AR(double length, double width){
	
	double AR = length*width;
	return AR;
}
}
