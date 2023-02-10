package models;

public class Paypal extends PaymentMethod{
	
	@Override
	void processPayment() {
		try {
			System.out.print("Processant pagament mitjançant paypal.");
			for (int i = 0; i < 6; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
