package poo;

public class Humano extends Avenger {
	private boolean tienePoderes;
	private boolean tieneArmadura;
	private boolean tieneArmas;
	//Mètodo constructor
	public Humano(String nombre, String alias, String traje, String raza, String lugarOrigen, boolean tienePoderes,
			boolean tieneArmadura, boolean tieneArmas) {
		super(nombre, alias, traje, raza, lugarOrigen);
		this.tienePoderes = tienePoderes;
		this.tieneArmadura = tieneArmadura;
		this.tieneArmas = tieneArmas;
	}
	@Override
	public void desplazarse(double velocidad) {
		System.out.println("Humano.desplazarse()");
		volar(velocidad);
		correr(velocidad);
	}
	@Override
	public void volar(double velocidad) {
		System.out.println("Humano avenger volando a " + velocidad + " kmph");
	}
	@Override
	public void correr(double velocidad) {
		System.out.println("Humano avenger corriendo a " + velocidad + " kmph");
	}
	@Override
	public void atacar() {
		System.out.println("Humano.atacar()");
		//super.atacar();	//Esto ejecuta el còdigo de atacar() que està en Avenger
	}
	
}
