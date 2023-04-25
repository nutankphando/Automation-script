package firstprogram;

public class Double {

	public static void main(String[] args) {

		// Area, Circumference, and volume of Cylinder:

		int radius = 280;
		int height = 230;
		double area = 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
		System.out.println("The area of the cylinder=:" + area);

		float radius1 = 3.53f;
		float height1 = 4.23f;
		double volume = 3.14 * radius1 * radius1 * height1;
		System.out.println("The volume of the cylinder=:" + volume);

		float radius2 = 53.2f;
		double circumference = 2 * 3.14 * radius2;
		System.out.println("The circumference of the cylinder=:" + circumference);

		// Area of Trapezoid:

		int area1 = 365;
		int breath = 562;
		int height11 = 542;
		double area2 = area1 + breath / 2 * height11;
		System.out.println("The area of the Trapezoid =:" + area2);

	}

}
