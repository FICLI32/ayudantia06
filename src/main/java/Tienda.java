import java.util.ArrayList;

public class Tienda {
	private String nombreTienda;
	private String direccion;
	private int horarioAtencion;
	private Inventario inventario;
	private Ciudad ciudad;
	private Compra compra;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Tienda(String nombreTienda, String direccion, int horarioAtencion) {
		this.nombreTienda = nombreTienda;
		this.direccion = direccion;
		this.horarioAtencion = horarioAtencion;
	}

	public String getNombreTienda() {
		return this.nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(int horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public void modificarEmpleado(int indice, Empleado empleado) {
		empleados.set(indice, empleado);
	}

	public void eliminarEmpleado(Empleado empleado) {
		empleados.remove(empleado);
	}

	public void mostrarEmpleados() {
		for (Empleado empleado : empleados) {
			System.out.println("Empleado: " + empleado.getNombre() + " -ID: " + empleado.getNumeroIdentificacion());
		}
	}

	public void agregarCLiente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void modificarCLiente(int indice, Cliente cliente) {
		clientes.set(indice, cliente);
	}

	public void eliminarCLiente(Cliente cliente) {
		clientes.remove(cliente);
	}

	public void mostrarClientes() {
		for (Cliente cliente : clientes) {
			System.out.println("Cliente: " + cliente.getNombreCliente() + " - ID: " + cliente.getNumeroCliente());
		}

	}

	public void actualizarInventario(Producto producto, int cantidadComprada){
		inventario.actualizarInventario(producto,cantidadComprada);
	}

	public void mostrarInventario(){
		inventario.mostrarProductos();
	}


}