package entidades;

public class Doctor extends Persona { // esto marca la herencia en java
	protected String nroDespacho;
	protected String nroColegiado;
	protected long idDoctor;

	public Doctor() {
		super(); // con esta linea llamo al constructor de la clase persona para que se  inicialicen las variables de la superclase
		this.vip = true;
	}

////////////////////////////////////////////////////////
	public String getNroDespacho() {
		return nroDespacho;
	}

	public void setNroDespacho(String nroDespacho) {
		this.nroDespacho = nroDespacho;
	}

	public String getNroColegiado() {
		return nroColegiado;
	}

	public void setNroColegiado(String nroColegiado) {
		this.nroColegiado = nroColegiado;
	}

////////////////////////////////////////////////////////ahora tiene heredado las variables de Persona
	@Override
	public String toString() {
		return "Doctor [nroDespacho=" + nroDespacho + ", nroColegiado=" + this.nroColegiado + ", id=" + id + ", nombre=" // si pongo this en id obtendra el id de clase doctor y si pongo super pongo el obtendra el id de clase persona
				+ nombre + ", edad=" + edad + ", vip=" + vip + ", estatura=" + estatura + ", inicial=" + inicial + "]";
	}

}
