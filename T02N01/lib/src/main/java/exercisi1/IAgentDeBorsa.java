package exercisi1;

public interface IAgentDeBorsa {
	
	void subscribe(AgenciaDeBorsa agenciaDeBorsa);
	
    void unsubscribe(AgenciaDeBorsa agenciaDeBorsa);
    
    void notifySubs(String notification);
    
}
