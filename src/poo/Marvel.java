package poo;

public class Marvel {

	public static void main(String[] args) {
		Avenger thor = new Avenger("Thor", "Dios del trueno", "Armadura y capa", "Asgardiano", "Asgard");
		Avenger nebula = new Avenger(null, null, null, null, null);
		nebula.ponerNombre("Nebula");
		nebula.ponerAlias("Desconocido");
		nebula.ponerLugarOrigen("Desconocido");
		nebula.ponerRaza("Eternal");
		thor.atacar();
		nebula.desplazarse(50.00);
		
		Humano spiderman = new Humano("Peter Parker","Spiderman","Armadura de araña","Humano", "Queens", true, true, true);
		spiderman.atacar();
		spiderman.desplazarse(80.00);
	}

}
