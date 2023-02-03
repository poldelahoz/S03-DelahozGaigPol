package exercisi1.concreteFactories;

import exercisi1.AgendaAbstractFactory;
import exercisi1.models.AgendaItemESP;

public class AgendaESPConcreteFactory implements AgendaAbstractFactory{

	@Override
	public AgendaItemESP createAgendaItem() {
		return new AgendaItemESP();
	}
	
}
