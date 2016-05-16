package calculation;

public class Food {
	
	private double price;
	private final double taxValue;
	private final String name;
	public static final double tax = 0.14;
	public Food(String name, double price)
	{
		this.price = price;
		this.name = name;
		this.taxValue = price * tax;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}

	public double getTaxPrice() {
		return taxValue;
	}
}
