package exercisi1;

import exercisi1.models.Vehicle;

public class Arrencar implements Accio{
	
	private Vehicle vehicle;
	
	public Arrencar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.arrencar();
	}
	
}
