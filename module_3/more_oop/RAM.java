public class RAM{
	private int size;
	
	public RAM(int size){
		this.size = size;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	

	public String toString(){ //removed parameters
		return "RAM: " + size + " GB";
	}
}