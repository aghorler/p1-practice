/* Superclass */

package practicetest;

public class Property{
	  protected String address;
	  protected double rent;
	  protected boolean isOccupied;
	  static int nextID = 1;
	  protected int id;
	  
	  public Property(){
	  }
	  
	  public Property(String address, double rent, boolean occupied){
	    this.address = address;
	    this.rent = rent;
	    this.isOccupied = occupied;
	    id = nextID++;
	  }
	  public String getAddress(){
	    return address;
	  }
	  public double getRent(){
	    return rent;
	  }
	  public boolean getOccupied(){
	    return isOccupied;
	  }
	  
	   public int getID(){
	    return id;
	  }
	  public void setOccupied(boolean occupied){
	    this.isOccupied = occupied;
	  }
	  
	  public String toString(){
	    return "\nId: " + id + "\nAddress: " + address + "\nRent: " + rent + "\nOccupied: " + isOccupied;
	  }
	}
