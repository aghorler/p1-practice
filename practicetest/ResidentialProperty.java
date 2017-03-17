/* Subclass of Property */

package practicetest;

public class ResidentialProperty extends Property{
	private String style;
	private int rooms;

	public ResidentialProperty(){
	}
	
	public ResidentialProperty(String address, double rent, boolean isOccupied, String style, int rooms) {
		super(address, rent, isOccupied);
		this.style = style;
		this.rooms = rooms;
	}
	
	public String getSytle(){
		return style;
	}
	
	public int getRooms(){
		return rooms;
	}
	
	public void setStyle(String style){
		this.style = style;
	}
	
	public void setRooms(int rooms){
		this.rooms = rooms;
	}
	
	public String toString(){
		return super.toString() + "\nStlye: " + style + "\nRooms: " + rooms;
	}

}
