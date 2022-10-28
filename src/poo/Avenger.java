package poo;

public class Avenger {
	//Atributos-Campos
	private String nombre;
	private String alias;
	private String traje;
	private String raza;
	private String lugarOrigen;
	//Comportamiento-Mètodos
	//Mètodos funcionales
	public void atacar() {
		System.out.println("Avenger.atacar()");
	}
	public void defender() {
		System.out.println("Avenger.defender()");
	}
	public void bailar() {
		System.out.println("Avenger.bailar()");
	}
	public void contarChistes() {
		System.out.println("Avenger.contarChistes()");
	}
	public void desplazarse(double velocidad) {
		System.out.println("Avenger.desplazarse()");
		volar(velocidad);
		correr(velocidad);
	}
	public void volar(double velocidad) {
		System.out.println("Extraterrestre avenger volando a " + velocidad + " kmph");
	}
	public void correr(double velocidad) {
		System.out.println("Extraterrestre avenger corriendo a " + velocidad + " kmph");
	}
	//Mètodos constructores
	public Avenger(String nombre, String alias, String traje, String raza, String lugarOrigen) {
		this.nombre = nombre;
		this.alias = alias;
		this.traje = traje;
		this.raza = raza;
		this.lugarOrigen = lugarOrigen;
	}
	//Mètodos getters y setters
	public String mostrarNombre() {
		return nombre;
	}
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	public String mostrarAlias() {
		return alias;
	}
	public void ponerAlias(String alias) {
		this.alias = alias;
	}
	public String mostrarTraje() {
		return traje;
	}
	public void ponerTraje(String traje) {
		this.traje = traje;
	}
	public String mostrarRaza() {
		return raza;
	}
	public void ponerRaza(String raza) {
		this.raza = raza;
	}
	public String mostrarLugarOrigen() {
		return lugarOrigen;
	}
	public void ponerLugarOrigen(String lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}
	
	
}
