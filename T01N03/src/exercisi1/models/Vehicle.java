package exercisi1.models;

public class Vehicle {
	
	private TipusVehicle tipus;
	
	public enum TipusVehicle{
		COTXE,
		BICICLETA,
		AVIO,
		VAIXELL
	}
	
	public Vehicle(TipusVehicle tipus) {
		this.tipus = tipus;
	}
	
	public void arrencar() {
		switch(this.tipus) {
			case COTXE:
				System.out.println("S'ha arrencat el cotxe.");
				break;
			case BICICLETA:
				System.out.println("S'ha arrencat la bicicleta.");
				break;
			case AVIO:
				System.out.println("S'ha arrencat l'avió.");
				break;
			case VAIXELL:
				System.out.println("S'ha arrencat el vaixell.");
				break;
		}
	}
	
	public void accelerar() {
		switch(this.tipus) {
			case COTXE:
				System.out.println("El cotxe està accelerant.");
				break;
			case BICICLETA:
				System.out.println("La bicicleta està accelerant.");
				break;
			case AVIO:
				System.out.println("L'avió està accelerant.");
				break;
			case VAIXELL:
				System.out.println("El vaixell està accelerant.");
				break;
		}
	}
	
	public void frenar() {
		switch(this.tipus) {
			case COTXE:
				System.out.println("El cotxe està frenant.");
				break;
			case BICICLETA:
				System.out.println("La bicicleta està frenant.");
				break;
			case AVIO:
				System.out.println("L'avió està frenant.");
				break;
			case VAIXELL:
				System.out.println("El vaixell està frenant.");
				break;
		}
	}
}
