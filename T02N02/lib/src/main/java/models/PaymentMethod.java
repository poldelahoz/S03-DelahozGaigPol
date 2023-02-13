package models;

import java.util.Optional;

import utils.PaymentGateway;

public abstract class PaymentMethod {
	
	final void processWith(PaymentGateway paymentGateway) {
		processPayment();
		Optional.ofNullable(paymentGateway).ifPresent(PaymentGateway::execute);
	}
	
	abstract void processPayment();
}
