package exercisi1.models;

public class AgendaItemEEUU implements AgendaItem{
	
	private final String EEUU_EXTENSION = "+1 ";
	
	private String address;
	private String phone;
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = EEUU_EXTENSION + phone;
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
