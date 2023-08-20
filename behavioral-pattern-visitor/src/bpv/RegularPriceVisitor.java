package bpv;

public class RegularPriceVisitor implements Visitor {
	
	private double totalPrice;

	@Override
	public void visit(Book book) {
		totalPrice += book.getPrice();
	}

	@Override
	public void visit(Electronics electronics) {
		totalPrice += electronics.getPrice();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

}
