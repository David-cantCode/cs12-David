public class CircleTest{
	public static void main(String[] args){
		
		Circle c1 = new Circle(5.5);


		System.out.println(c1.getArea());

		System.out.println(c1.getCircumference()); //deleted paramters, our function no longer has any

		c1.setRadius(6.7);

		System.out.println(c1.getArea());

		System.out.println(c1.getCircumference());


		//added spacing between lines for readability

	}
}

