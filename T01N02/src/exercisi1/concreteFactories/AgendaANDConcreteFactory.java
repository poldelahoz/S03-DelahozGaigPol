package exercisi1.concreteFactories;

import exercisi1.AgendaAbstractFactory;
import exercisi1.models.AgendaItemAND;

public class AgendaANDConcreteFactory implements AgendaAbstractFactory{

	@Override
	public AgendaItemAND createAgendaItem() {
		return new AgendaItemAND();
	}
	
}
