package spf.service;

import spf.entity.Issue;

public class CustomerService {
	
	public void notifyCustomer(String message) {
		System.out.println("Notification sent to customer : " + message);
	}

	public void escalateToManager(Issue issue) {
		System.out.println("Issue escalated to manager : " + issue.getDescription());
	}
}
