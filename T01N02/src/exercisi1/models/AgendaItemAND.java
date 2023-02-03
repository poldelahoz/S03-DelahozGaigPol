package exercisi1.models;

public class AgendaItemAND implements AgendaItem{
	
	private final String AND_EXTENSION = "+376 ";
	
	private String address;
	private String phone;
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = AND_EXTENSION + phone;
	}

	@Override
	public String getAddress() {
		return this.address;
	}

	@Override
	public String getPhone() {
		return this.phone;
	}
}
