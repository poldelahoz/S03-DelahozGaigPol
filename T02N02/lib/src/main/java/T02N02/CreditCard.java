package T02N02;

public class CreditCard implements PaymentMethod{
	
	private String name;
	private String number;
	private String expireMonth;
	private String expireYear;
	private int CVV;
	
	public CreditCard(String name, String number, String expireMonth, String expireYear, int CVV) {
		this.name = name;
		this.number = number;
		this.expireMonth = expireMonth;
		this.expireYear = expireYear;
		this.CVV = CVV;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	public String getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	@Override
	public void processPayment() {
		System.out.println("Pagament processat mitjançant tarjeta de crèdit.");
	}
}
