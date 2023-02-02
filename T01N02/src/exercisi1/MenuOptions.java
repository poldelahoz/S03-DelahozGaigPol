package exercisi1;

import exercisi1.AgendaFactoryProducer.FactoryType;
import exercisi1.models.*;

public class MenuOptions {
	
	public static void option1() {
		AgendaAbstractFactory agendaESP = AgendaFactoryProducer.getFactory(FactoryType.ESP);
		String address = Entrada.readString("Introdueix l'adreça: ");
		String phone = Entrada.readString("Introdueix el número de telèfon: ");
		AgendaItem agendaItemESP = agendaESP.createAgendaItem();
		agendaItemESP.setAddress(address);
		agendaItemESP.setPhone(phone);
		Main.agenda.add(agendaItemESP);
		System.out.println("Adreça i telèfon afegits.");
	}
	
	public static void option2() {
		AgendaAbstractFactory agendaAND = AgendaFactoryProducer.getFactory(FactoryType.AND);
		String address = Entrada.readString("Introdueix l'adreça: ");
		String phone = Entrada.readString("Introdueix el número de telèfon: ");
		AgendaItem agendaItemAND = agendaAND.createAgendaItem();
		agendaItemAND.setAddress(address);
		agendaItemAND.setPhone(phone);
		Main.agenda.add(agendaItemAND);
		System.out.println("Adreça i telèfon afegits.");
	}
	
	public static void option3() {
		AgendaAbstractFactory agendaEEUU = AgendaFactoryProducer.getFactory(FactoryType.EEUU);
		String address = Entrada.readString("Introdueix l'adreça: ");
		String phone = Entrada.readString("Introdueix el número de telèfon: ");
		AgendaItem agendaItemEEUU = agendaEEUU.createAgendaItem();
		agendaItemEEUU.setAddress(address);
		agendaItemEEUU.setPhone(phone);
		Main.agenda.add(agendaItemEEUU);
		System.out.println("Adreça i telèfon afegits.");
	}
	
	public static void option4() {
		Main.agenda.forEach(c -> System.out.println("Adreça: " + c.getAddress() + " | Telèfon: " + c.getPhone()));
	}
}
