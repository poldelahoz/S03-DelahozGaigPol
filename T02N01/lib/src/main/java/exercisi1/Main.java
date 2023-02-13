package exercisi1;

public class Main {
    
	public static void main(String[] args) {
		Borsa borsa = new Borsa(100);
		AgentDeBorsa agentDeBorsa1 = new AgentDeBorsa("Agent 1");
		AgentDeBorsa agentDeBorsa2 = new AgentDeBorsa("Agent 2");
		AgenciaDeBorsa agenciaDeBorsa1 = new AgenciaDeBorsa("Agencia 1");
		AgenciaDeBorsa agenciaDeBorsa2 = new AgenciaDeBorsa("Agencia 2");
		AgenciaDeBorsa agenciaDeBorsa3 = new AgenciaDeBorsa("Agencia 3");
		
		borsa.subscribe(agentDeBorsa1);
		borsa.subscribe(agentDeBorsa2);
		agentDeBorsa1.subscribe(agenciaDeBorsa1);
		agentDeBorsa1.subscribe(agenciaDeBorsa2);
		agentDeBorsa2.subscribe(agenciaDeBorsa3);
		
		System.out.println("Valor de la Borsa actual: " + borsa.getValue());
		System.out.println();
		System.out.println("Canviem el valor de la Borsa a 115");	
		borsa.setValue(115);
		System.out.println();
		System.out.println("Canviem el valor de la Borsa a 107");	
		borsa.setValue(107);
	}
	
}
