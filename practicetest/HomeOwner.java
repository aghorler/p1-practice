package practicetest;

import java.util.*;

public class HomeOwner {
	
	public static void main(String[] args){
	
		int billCount = 0;
		
		Bill[] bills;
		bills = new Bill[4];
		
		for(int i = 0; i < 4; i++){
			Scanner input = new Scanner(System.in);
			
			System.out.println("Input service: ");
			String service = input.nextLine();
	    
			System.out.println("Input date: ");
			int date = input.nextInt();
	    
			System.out.println("Input month: ");
			int month = input.nextInt();
	    
			Bill b = new Bill(service, date, month);
			
			bills[billCount] = b; //this is very important
			billCount++;
		}
	
		bills[0].setAmount(123.0);
		bills[1].setAmount(456.0);
		bills[2].setAmount(789.0);
		bills[3].setAmount(321.0);
		
		for(int i = 0; i < billCount; i++){
			System.out.println(bills[i] + "\nAmount: " + bills[i].getAmount());
		}
		
		bills[0].setPaid(true);
		bills[1].setPaid(true);
		
		for(int i = 0; i < billCount; i++){
			if(bills[i].getPaid() == false){
				System.out.println(bills[i]);	
			}
		}
		
		//this is separate, but I'll put it here. All goes in method. Works!
		
		double sum = 0;
		
		for(int i = 0; i < billCount; i++){
			if(bills[i].getAmount() != 0.0){
				sum += bills[i].getAmount();
			}
		}
		
		System.out.println(sum);
		
	
	}
	
}
