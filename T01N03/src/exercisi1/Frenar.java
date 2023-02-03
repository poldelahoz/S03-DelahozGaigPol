package exercisi1;

import exercisi1.models.Vehicle;

public class Frenar implements Accio{
	
	private Vehicle vehicle;
	
	public Frenar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.frenar();
	}
	
}
