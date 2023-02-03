package exercisi1;

import exercisi1.concreteFactories.*;

public class AgendaFactoryProducer {
	
	public enum FactoryType {
		ESP,
		EEUU,
		AND
	}
	
	public static AgendaAbstractFactory getFactory(FactoryType factoryType) {
		switch(factoryType) {
			case ESP:
				return new AgendaESPConcreteFactory();
			case EEUU:
				return new AgendaEEUUConcreteFactory();
			case AND:
				return new AgendaANDConcreteFactory();
			default: return null;
		}
	}
}
