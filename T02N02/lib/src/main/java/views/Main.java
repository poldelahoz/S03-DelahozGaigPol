package views;

import controllers.MenuController;
import models.BankDebit;
import models.CreditCard;
import models.Paypal;
import models.ShoesStore;
import utils.Entry;

public class Main {

	public static void main(String[] args) {
		ShoesStore store = new ShoesStore();
		
		String[] options = new String[] {
				"Pagar amb tarjeta de crèdit.",
				"Pagar amb Paypal.",
				"Pagar amb deute al compte bancari."
		};
		MenuController menuC = MenuController.getInstance();
		menuC.setOptions(options);
		
		int option;
        boolean exit = false;
		while (!exit){
        	menuC.printMenu();
        	option = Entry.readInt("", menuC.getOptionsLength());
            switch (option){
                case 1: store.processPayment(new CreditCard());; break;
                case 2: store.processPayment(new Paypal());; break;
                case 3: store.processPayment(new BankDebit());; break;
                case 0: System.out.println("Fins aviat!"); exit = true; break;
                default: System.out.println("Només números entre 0 i " + menuC.getOptionsLength());
            }
		}
		
		
		
	}

}
