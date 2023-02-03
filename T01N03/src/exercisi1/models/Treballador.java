package exercisi1.models;

import java.util.ArrayList;
import java.util.List;

import exercisi1.Accio;

public class Treballador {
	
	private List<Accio> accions;
	
	public Treballador() {
		this.accions = new ArrayList<Accio>();
	}
	
	public void rebreAccio(Accio accio) {
		this.accions.add(accio);
	}
	
	public void executarOperacions() {
		this.accions.forEach(c -> c.execute());
		this.accions.clear();
	}
}
