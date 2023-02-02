package exercisi1;

import java.util.ArrayList;
import java.util.List;

public class AgentDeBorsa{
	
	private String name;	
	private List<AgenciaDeBorsa> subscribers;
	
	public AgentDeBorsa(String name) {
		this.name = name;
		this.subscribers = new ArrayList<AgenciaDeBorsa>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//@Override
	public void subscribe(AgenciaDeBorsa agenciaDeBorsa) {
		subscribers.add(agenciaDeBorsa);
	}

	//@Override
	public void unsubscribe(AgenciaDeBorsa agenciaDeBorsa) {
		subscribers.remove(agenciaDeBorsa);
	}
	
	//@Override
	public void notifySubs(String notification) {
		subscribers.forEach(c -> c.update(this.name, notification));
	}
}
