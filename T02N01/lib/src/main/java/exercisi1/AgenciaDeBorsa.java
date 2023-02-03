package exercisi1;

public class AgenciaDeBorsa{
	
	public String name;
	
	public AgenciaDeBorsa(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void update(String nomAgent, String notification) {
		System.out.println(nomAgent + " notifica a " + this.name + ": " + notification);
	}
}
