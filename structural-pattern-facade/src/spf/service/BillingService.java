package spf.service;

import spf.entity.Payment;
import spf.entity.RefundStatus;

public class BillingService {
	public Payment getPaymentForOrder(int orderId) {
		return new Payment(50.0);
	}
	
	public RefundStatus processRefund(Payment payment) {
		if (payment.getAmount() > 0) {
			return RefundStatus.SUCCESS;
		} else {
			return RefundStatus.FAILURE;
		}
	}
}
