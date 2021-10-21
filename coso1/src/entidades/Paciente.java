package entidades;

public class Paciente extends Persona {
		private long idPaciente;
		
	public Paciente() {
		super();
		this.vip = false;
	}

	public long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", vip="
				+ vip + ", estatura=" + estatura + ", inicial=" + inicial + "]";
	}

	
	
}
