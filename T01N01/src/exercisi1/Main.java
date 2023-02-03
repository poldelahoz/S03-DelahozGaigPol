package exercisi1;

public class Main {
	
	public static boolean keepReading = true;

	public static void main(String[] args) {
		
		// No podem cridar al constructor ja que es un Singleton
		// Undo undo = new Undo();
		
		// Només podem cridar a getInstance(), que sempre ens tornarà la mateixa instància
		Undo undo = Undo.getInstance();
		
		undo.printHelp();
		while(keepReading) {
			String command = Entrada.readString("> ");
			undo.addToUndoStack(command);
		}
	}

}
