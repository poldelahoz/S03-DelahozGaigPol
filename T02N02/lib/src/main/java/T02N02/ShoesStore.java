package T02N02;

public class ShoesStore {
	
	private PaymentMethod paymentMethod;
	
	public void processPayment(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
		this.paymentMethod.processWith(() -> System.out.println("Pagament finalitzat."));
	}
}
