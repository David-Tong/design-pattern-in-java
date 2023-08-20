package bpv;

public class DiscountPriceVisitor implements Visitor {
	
	private double totalPrice;
	
	@Override
	public void visit(Book book) {
		totalPrice += book.getPrice() * book.getDiscount();
	}

	@Override
	public void visit(Electronics electronics) {
		totalPrice += electronics.getPrice() * electronics.getDiscount();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
}
