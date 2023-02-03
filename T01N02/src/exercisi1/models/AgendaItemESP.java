package exercisi1.models;

public class AgendaItemESP implements AgendaItem{
	
	private final String ESP_EXTENSION = "+34 ";
	
	private String address;
	private String phone;
	
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = ESP_EXTENSION + phone;
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
