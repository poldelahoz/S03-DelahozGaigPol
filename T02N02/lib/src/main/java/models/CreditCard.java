package models;

public class CreditCard extends PaymentMethod{

	@Override
	public void processPayment() {
		try {
			System.out.print("Processant pagament mitjançant tarjeta de crèdit.");
			for (int i = 0; i < 6; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
