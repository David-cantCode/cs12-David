public class ComputerTest{
	public static void main(String[] args){
		RAM r1 = new RAM(16);

		//swtiched position of 'r1' and '250'
		Computer c1 = new Computer(r1, 250, "Windows 10");
		System.out.println(c1);
	}

	

	
}