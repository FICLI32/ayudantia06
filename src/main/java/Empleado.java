public class Empleado {
	private String nombre;
	private int numeroIdentificacion;
	private String cargo;
	private Tienda tienda;

	public Empleado(String nombre, int numeroIdentificacion, String cargo) {
		this.nombre = nombre;
		this.numeroIdentificacion = numeroIdentificacion;
		this.cargo = cargo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroIdentificacion() {
		return this.numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}