
public class Concert {
	
	String name = "No name yet";
	int phonesold = 0;
	int venuesold = 0;
	double phoneprice = 0;
	double venueprice = 0;
	int capacity = 0;

	Concert (String bandName, int capac, double priceByPhone, double priceAtVenue) {
		 this.name = bandName;
		 this.capacity = capac;
		 this.phoneprice = priceByPhone;
		 this.venueprice = priceAtVenue;
	}

	public Concert() {
		// TODO Auto-generated constructor stub
	}

	public String getBandName() {
		return name;
	}
	
	public void setBandName(String name) {
		this.name = name;
	}
	
	public int getNumTicketsSoldByPhone() {
		return phonesold;
	}
	
	public void setPriceByPhone(double price) {
		this.phoneprice = price;
	}
	
	public int getNumTicketsSoldAtVenue() {
		return venuesold;
	}
	
	public void setPriceAtVenue(double price) {
		this.venueprice = price;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int ticketsRemaining() {
		return (this.capacity - (phonesold + venuesold));
	}
	public double totalSales() {
		return (phonesold*phoneprice + venuesold*venueprice);
	}
	public void buyTicketsByPhone(int tickets) {
		if (phonesold + venuesold + tickets < this.capacity) {
		this.phonesold += tickets;
		} else {
			System.out.println("Amount chosen exceeds remaining capacity.");
		}
	}
	public void buyTicketsAtVenue(int tickets) {
		if (phonesold + venuesold + tickets < this.capacity) {
		this.venuesold = this.venuesold + tickets;
		} else {
			System.out.println("Amount chosen exceeds remaining capacity.");
		}
	}
	public int totalNumberOfTicketsSold() {
		return phonesold + venuesold;
	}
}

