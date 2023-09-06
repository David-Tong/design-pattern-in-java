package spf;

import spf.entity.Issue;
import spf.facade.CustomerSupportFacade;
import spf.service.BillingService;
import spf.service.CustomerService;
import spf.service.ShippingService;

public class Client {

	public static void main(String[] args) {
		BillingService billingService = new BillingService();
		CustomerService customerService = new CustomerService();
		ShippingService shippingService = new ShippingService();
		
		CustomerSupportFacade csf = new CustomerSupportFacade(billingService, customerService, shippingService);
		csf.handleRefundRequest(12345);
		csf.changeShippingAddress(12345, "123 New Street, New York, NY 10001");
		Issue issue = new Issue("Product not working properly");
		csf.escalateToManager(issue);
	}

}
