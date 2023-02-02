package exercisi1;

import java.util.ArrayList;

import exercisi1.models.AgendaItem;

public class Main {
	
	public static ArrayList<AgendaItem> agenda = new ArrayList<AgendaItem>();

	public static void main(String[] args) {
		
		Menu menu = new Menu(new String[] {
				"1.- Introduir adreça i telèfon ESPANYOL.",
				"2.- Introduir adreça i telèfon ANDORRÀ.",
				"3.- Introduir adreça i telèfon de EEUU.",
				"4.- Mostre tota l'agenda.",
				"0.- Sortir."
		});
		
		
		int option;
        boolean exit = false;
		while (!exit){
        	option = menu.printMenu();
            switch (option){
                case 1: MenuOptions.option1(); break;
                case 2: MenuOptions.option2(); break;
                case 3: MenuOptions.option3(); break;
                case 4: MenuOptions.option4(); break;
                case 0: System.out.println("Fins aviat!"); exit = true; break;
                default: System.out.println("Només números entre 0 i 4");
            }
		}
	}

}
