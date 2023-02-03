package exercisi1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo instance;
	private ArrayList<String> commandsStack = new ArrayList<String>();
	
	private Undo() {};
	
	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	
	public void addToUndoStack(String command) {
		switch(command.split(" ")[0]) {
			case "help":
				printHelp();
				break;
			case "undo":
				undo();
				break;
			case "show":
				show();
				break;
			case "clear":
				clear();
				break;
			case "exit":
				exit();
				break;
		}
		commandsStack.add(command);
	}
	
	public void printHelp() {
		System.out.println("Opcions:");
		System.out.println();
		System.out.println("help	Mostra el menú d'ajuda.");
		System.out.println("show	Mostra totes les comandes inserides.");
		System.out.println("undo	Elimina l'última comanda.");
		System.out.println("clear	Neteja l'historial de comandes.");
		System.out.println("exit	Surt de l'aplicació.");
		System.out.println();
	}
	
	private void undo() {
		if (commandsStack.size() > 0) {
			commandsStack.remove(commandsStack.size() - 1);
		}
	}
	
	private void show() {
		commandsStack.forEach(System.out::println);
	}
	
	private void clear() {
		commandsStack.clear();
	}
	
	private void exit(){
		Main.keepReading = false;
	}
}
