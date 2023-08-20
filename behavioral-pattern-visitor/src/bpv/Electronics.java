package bpv;

public class Electronics implements Item {
	
	private double price;
	private double discount;
	
	public Electronics(double price, double discount) {
		this.price = price;
		this.discount = discount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getDiscount() {
		return discount;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
