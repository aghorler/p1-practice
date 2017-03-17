/* Subclass of Property */

package practicetest;

public class CommericalProperty extends Property{
	private double floorSpace;
	
	public CommericalProperty(){
	}
	
	public CommericalProperty(String address, double rent, boolean isOccupied, double floorSpace){
		super(address, rent, isOccupied);
		this.floorSpace = floorSpace;
	}
	
	public double getFloorSpace(){
		return floorSpace;
	}
	
	public void setFloorSpace(double floorSpace){
		this.floorSpace = floorSpace;
	}
	
	public String toString(){
		return super.toString() + "\nFloor space: " + floorSpace;
	}
	
}
