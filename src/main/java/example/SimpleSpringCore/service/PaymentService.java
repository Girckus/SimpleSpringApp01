package example.SimpleSpringCore.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service("payment")
public class PaymentService {
	
	private static int instance = 0;
	
	public PaymentService() {
		instance++;
	}
	
	public void processPayment(double amount) {
		System.out.println("Processando pagamento no valor de: " + amount + " usando PaymentService " + instance);
	}
}