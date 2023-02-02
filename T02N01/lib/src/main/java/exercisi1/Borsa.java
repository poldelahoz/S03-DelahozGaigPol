package exercisi1;

import java.util.ArrayList;
import java.util.List;

public class Borsa {
	
	private List<AgentDeBorsa> subscribers;
	private int value;
	
	public Borsa(int inititalValue) {
		this.subscribers = new ArrayList<AgentDeBorsa>();
		this.value = inititalValue;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		String notification;
		if(this.value < value) {
			int difference =  value - this.value;
			notification = "La borsa ha pujat " + difference + " punts fins als " + value + " punts.";
		}else {
			int difference = this.value - value;
			notification = "La borsa ha baixat " + difference + " punts fins als " + value + " punts.";
		}
		this.value = value;
		notifySubs(notification);
	}

	public void subscribe(AgentDeBorsa agentDeBorsa) {
		subscribers.add(agentDeBorsa);
	}

	public void unsubscribe(AgentDeBorsa agentDeBorsa) {
		subscribers.remove(agentDeBorsa);
	}

	public void notifySubs(String notification) {
		subscribers.forEach(c -> c.notifySubs(notification));
	}
}
