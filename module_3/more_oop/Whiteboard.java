public class Whiteboard{
	public boolean isClean = false;
	private boolean hasMarker = true;
	private double length; //changed to a double
	public double width = 10.5;
	
	public Whiteboard(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public Whiteboard(double length, double width, boolean hasMarker){
		this.length = length;
		this.width = width;
		this.hasMarker = hasMarker;
	}
	
	public Whiteboard(double length, double width, boolean hasMarker, boolean isClean){
		this.length = length;
		this.width = width;
		this.hasMarker = hasMarker;
		this.isClean = isClean;
	}
	
	public boolean getIsClean(){ //changed function type to bool
								//i dont like how you have to write 'boolean' out why cant it just be bool
		return isClean;
	}
 
	public boolean getHasMarker(){
		return hasMarker;
	}
	
	public double getLength(){
		return length;
	}
	
	private double getWidth(){ //changed functuon type to double, becuase the width is a double
		return width;
	}
	
	public void setHasMarker(boolean hasMarker){
		this.hasMarker = hasMarker;
	}
	
	public void setIsClean(boolean isClean){
		this.isClean = isClean;
	}
	
	public String toString(){
		if (isClean){
			if (hasMarker){
				return "The whiteboard is " + length + " X " + width + " and is clean and does have a marker";
			}else{
				return "The whiteboard is " + length + " X " + width + " and is clean and does not have a marker";
			}
		}else{
			if (hasMarker){
				return "The whiteboard is " + length + " X " + width + " and is not clean and does have a marker";
			}else{
				return "The blueboard is " + length + " X " + width + " and is not clean and does not have a marker";
			}
		}
	}
}
	