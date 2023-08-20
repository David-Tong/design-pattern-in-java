package bpv;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Book(50, 0.8));
		items.add(new Book(30, 0.7));
		items.add(new Electronics(100, 0.9));
		
		RegularPriceVisitor regularPriceVisitor = new RegularPriceVisitor();
		DiscountPriceVisitor discountPriceVisitor = new DiscountPriceVisitor();
		
		for (Item item : items) {
			item.accept(regularPriceVisitor);
			item.accept(discountPriceVisitor);
		}
		
		System.out.println("Regular total price : " + regularPriceVisitor.getTotalPrice());
		System.out.println("Discount total price : " + discountPriceVisitor.getTotalPrice());
	}

}
