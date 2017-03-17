package practicetest;

import java.util.*;

public class EstateAgent {
	private ArrayList<Property> properties;
	
	public EstateAgent(){
		properties = new ArrayList<Property>();
	}
	
	private void addProperty(){
		Scanner input = null;
		try{
			input = new Scanner(System.in);
			System.out.println("Address: ");
			String address = input.nextLine();
			System.out.println("Rent: ");
			double rent = input.nextDouble();
			System.out.println("Occupied status: true/false");
			boolean isOccupied = input.nextBoolean();
			input.nextLine();
			
			int typeRequired = 0;
			System.out.println("Type of property required: " +
								"\n1. Residental" + 
								"\n2. Commerical");
			typeRequired = input.nextInt();
			switch(typeRequired){
			case 1:
				input.nextLine();
				System.out.println("Style: ");
				String style = input.nextLine();
				
				System.out.println("Rooms: ");
				int rooms = input.nextInt();
				
				Property rp = new ResidentialProperty(address, rent, isOccupied, style, rooms);
				properties.add(rp);
				break;
			case 2:
				System.out.println("Floor space: ");
				int floorSpace = input.nextInt();
				
				Property cp = new CommericalProperty(address, rent, isOccupied, floorSpace);
				properties.add(cp);
				break;
			default:
				System.out.println("Incorrect input. Please 1 or 2.");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	private void listProperties(){
		for(Property p: properties){
			System.out.println(p);
		}
	}
	
	
	private void listAvailable(){
		for(Property p: properties){
			if(p.getOccupied() == false){
				System.out.println(p);
			}
		}
	}
	
	private void removeProperty(){
		Scanner input = null;
		try{
			input = new Scanner(System.in);
			listProperties();
			System.out.println("Enter ID to remove: ");
			int id = input.nextInt();
			Property removed = null;
			for(int i = 0; i < properties.size(); i++){
				Property p = properties.get(i);
				if(id == p.getID()){
					removed = properties.remove(i);
					System.out.println("Removed: " + removed);
				}
			}
		}	
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	private void listResidential(){
		for(Property p: properties){
			if(p instanceof ResidentialProperty){
				System.out.println(p);
			}
		}
	}
	
	private void searchForResidential(){
		Scanner input = null;
		try{
			input = new Scanner(System.in);
			listResidential();
			System.out.println("Enter ID: ");
			int id = input.nextInt();
			for(Property p: properties){
				if(p.getID() == id){
					System.out.println(p);
				}
			}
		}
		catch(Exception e){
				System.out.println(e.getMessage());
		}
		
	}
	
	private void rentProperty(){
		Scanner input = null;
		try{
			input = new Scanner(System.in);
			listResidential();
			System.out.println("Enter ID: ");
			int id = input.nextInt();
			for(Property p: properties){
				if(p.getID() == id && !p.getOccupied()){
					p.setOccupied(true);
				}
			}
		}
		catch(Exception e){
				System.out.println(e.getMessage());
		}
	}
	
	public void run(){
		Scanner input = null;
		try{
			boolean flag = true;
		
			while(flag){
				System.out.println("1. Add  property\n" +
									"2. List all properties\n" +
									"3. List available properties\n" +
									"4. Remove property by ID\n" +
									"5. List residential\n" +
									"6. Search for available residential property\n" +
									"7. Rent property\n" +
									"8. Quit");	
				
				input = new Scanner(System.in);
				int choice = 0;
			
				System.out.println("Enter your choice (1 - 8): ");
				choice = input.nextInt();
				
				switch(choice){
				case 1:
					addProperty();
					break;
				case 2:
					listProperties();
					break;
				case 3:
					listAvailable();
					break;
				case 4:
					removeProperty();
					break;
				case 5:
					listResidential();
					break;
				case 6:
					searchForResidential();
					break;
				case 7:
					rentProperty();
					break;
				case 8:
					flag = false;
					break;
				default:
					System.out.println("Incorrect input. Please enter a number between 1 and 8.");
				}
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			if(input != null){
				input.close(); //close scanner
			}
		}
	}

}
