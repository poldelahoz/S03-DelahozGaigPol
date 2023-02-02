package exercisi1;

import exercisi1.models.Vehicle;

public class Accelerar implements Accio{
	
	private Vehicle vehicle;
	
	public Accelerar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.accelerar();
	}
	
}
