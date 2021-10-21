package entidades;

public class Persona {
	protected long id = 0;
	protected String nombre = null;
	protected int edad = 0;
//	private localDate fechaInscripcion = null;
	protected boolean vip = false;
	protected double estatura = 0.0;
	protected char inicial;
	//protected Asignatura asignaturaFav;

	///////////////////////////////////////////////////
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
 
	public void setEdad(int edad) {
		this.edad = edad;
	}

//	public localDate getFechaInscripcion() {
//		return fechaInscripcion;
//	}
//
//	public void setFechaInscripcion(localDate fechaInscripcion) {
//		this.fechaInscripcion = fechaInscripcion;
//	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public char getInicial() {
		return inicial;
	}

	public void setInicial(char inicial) {
		this.inicial = inicial;
	}

	//public Asignatura getAsignaturaFav() {
	//	return asignaturaFav;
	//}

//	public void setAsignaturaFav(Asignatura asignaturaFav) {
//		this.asignaturaFav = asignaturaFav;//}

	// too string, se puede editar la cadena para que imprima mas bonito.
	// this 
	@Override
	public String toString() {
		return "Persona [id=" + this.id + ", nombre=" + nombre + ", edad=" + edad + ", vip=" + vip + ", estatura="
				+ estatura + ", inicial=" + inicial + "]";
	}

}
