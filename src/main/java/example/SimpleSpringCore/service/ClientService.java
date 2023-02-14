package example.SimpleSpringCore.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Controller;

@Controller("client")
public abstract class ClientService {
	
	public void processPayment(double amount) {
		PaymentService paymentService = getPaymentService();
	    paymentService.processPayment(amount);
	}
	
	@Lookup
	protected abstract PaymentService getPaymentService();
}