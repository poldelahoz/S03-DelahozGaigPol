package T02N02;

import java.util.Optional;

public abstract class PaymentMethod {
	
	final void processWith(PaymentGateway paymentGateway) {
		processPayment();
		Optional.ofNullable(paymentGateway).ifPresent(PaymentGateway::execute);
	}
	
	abstract void processPayment();
}
