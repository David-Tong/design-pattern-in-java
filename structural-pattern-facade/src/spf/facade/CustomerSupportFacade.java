package spf.facade;

import spf.entity.Issue;
import spf.entity.Payment;
import spf.entity.RefundStatus;
import spf.service.BillingService;
import spf.service.CustomerService;
import spf.service.ShippingService;

public class CustomerSupportFacade {
	
	private BillingService billingService;
	private CustomerService customerService;
	private ShippingService shippingService;
	
	public CustomerSupportFacade(BillingService billingService, CustomerService customerService, ShippingService shippingService) {
		this.billingService = billingService;
		this.customerService = customerService;
		this.shippingService = shippingService;
	}
	
	public void handleRefundRequest(int orderId) {
		Payment payment = billingService.getPaymentForOrder(orderId);
		RefundStatus refundStatus = billingService.processRefund(payment);
		customerService.notifyCustomer("Refund status " + refundStatus);
	}
	
	public void changeShippingAddress(int orderId, String newAddress) {
		shippingService.updateShippingAddress(orderId, newAddress);
		customerService.notifyCustomer("Shipping address updated");
	}
	
	public void escalateToManager(Issue issue) {
		customerService.escalateToManager(issue);
	}
}
