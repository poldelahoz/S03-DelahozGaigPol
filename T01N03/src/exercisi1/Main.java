package exercisi1;

import exercisi1.models.Treballador;
import exercisi1.models.Vehicle;
import exercisi1.models.Vehicle.TipusVehicle;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Vehicle cotxe = new Vehicle(TipusVehicle.COTXE);
		Vehicle bicicleta = new Vehicle(TipusVehicle.BICICLETA);
		Vehicle avio = new Vehicle(TipusVehicle.AVIO);
		Vehicle vaixell = new Vehicle(TipusVehicle.VAIXELL);
		
		Arrencar arrencarCotxe = new Arrencar(cotxe);
		Accelerar accelerarCotxe = new Accelerar(cotxe);
		Arrencar arrencarAvio = new Arrencar(avio);
		Accelerar accelerarAvio = new Accelerar(avio);
		Frenar frenarCotxe = new Frenar(cotxe);
		Frenar frenarAvio = new Frenar(avio);
		
		Treballador treballador = new Treballador();
		
		treballador.rebreAccio(arrencarCotxe);
		treballador.rebreAccio(accelerarCotxe);
		treballador.rebreAccio(arrencarAvio);
		treballador.rebreAccio(accelerarAvio);
		treballador.rebreAccio(frenarCotxe);
		treballador.rebreAccio(frenarAvio);
		
		treballador.executarOperacions();
		System.out.println();
		
		treballador.rebreAccio(arrencarAvio);
		treballador.rebreAccio(accelerarAvio);
		treballador.rebreAccio(arrencarCotxe);
		treballador.rebreAccio(accelerarCotxe);
		treballador.rebreAccio(frenarAvio);
		treballador.rebreAccio(frenarCotxe);
		
		treballador.executarOperacions();
	}

}
