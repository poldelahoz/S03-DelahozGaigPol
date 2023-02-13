package models;

public class BankDebit extends PaymentMethod{

	@Override
	void processPayment() {
		try {
			System.out.println("Processant pagament mitjançant deute en compte bancari.");
			for (int i = 0; i < 6; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
