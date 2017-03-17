package practicetest;

public class Bill {
	
	private int billNo = 1;
	private String service;
	private int date;
	private int month;
	private double amount;
	private boolean paid;
	static int nextID = 1;
	
	public Bill(){
		this.service = "Mobile";
		this.date = 1;
		this.month = 4;
		billNo = nextID;
		nextID++;
	}
	
	public Bill(String service, int date, int month){
		this.service = service;
		this.date = date;
		this.month = month;
		billNo = nextID;
		nextID++;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setPaid(boolean paid){
		this.paid = paid;
	}
	
	public boolean getPaid(){
		return paid;
	}
	
	public String toString(){
		return "\nBill No: " + billNo + 
				"\nService: " + service + 
				"\nDate: " + date + " " +
				"Month: " + month;
	}
	
}
