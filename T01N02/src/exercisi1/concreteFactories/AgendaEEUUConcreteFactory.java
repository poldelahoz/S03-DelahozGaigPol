package exercisi1.concreteFactories;

import exercisi1.AgendaAbstractFactory;
import exercisi1.models.AgendaItemEEUU;

public class AgendaEEUUConcreteFactory implements AgendaAbstractFactory{

	@Override
	public AgendaItemEEUU createAgendaItem() {
		return new AgendaItemEEUU();
	}
	
}
