package spf.service;

public class ShippingService {
	public void updateShippingAddress(int orderId, String newAddress) {
		System.out.println("Shipping address for order " + orderId + " updated to " + newAddress);
	}
}
