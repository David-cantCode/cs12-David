public class Computer{
	//variables
	private RAM ram;
	private int storage;
	private String os;
	

	//changed to public
	public Computer(RAM ram, int storage, String os){
		this.ram = ram;
		this.storage = storage;
		this.os = os;
	}
	
	public RAM getRam(){
		return ram;
	}
	
	public int getStorage(){ //changed function type to int, because storage is a int
		return storage;
	}
	
	public String getOS(){
		return os;
	}
	
	public void setRam(RAM ram){ //change function type to void because we are not returning anything
		this.ram = ram;
	}
	
	public void setStorage(int storage){
		this.storage = storage;
	}
	
	public void setOS(String os){
		this.os = os;
	}
	

	public String toString(){ //changed function type to String, because we are returning a string :p
		return ram + ", Storage: " + storage + "GB, OS: " + os;
	}
}
	