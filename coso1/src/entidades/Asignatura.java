package entidades;

public class Asignatura {
	private long id = 0;
	private String nombre = null;
	private int duracion = 0;
	private boolean aprobable = false;
	
	///////////////////////////////////////////////

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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isAprobable() {
		return aprobable;
	}

	public void setAprobable(boolean aprobable) {
		this.aprobable = aprobable;
	}

	///////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", aprobable=" + aprobable
				+ "]";
	}

}
