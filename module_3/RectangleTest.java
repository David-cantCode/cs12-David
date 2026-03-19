public class RectangleTest{
	public static void main(String[] args){

		Rectangle r1 = new Rectangle(6 ,10); //changed 5,5 -> 6 because our method only allows ints
		
		System.out.println(r1.getArea());
		
		
		System.out.println(r1.getPerimeter());
	}
}
