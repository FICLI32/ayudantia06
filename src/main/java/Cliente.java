import java.util.ArrayList;

public class Cliente {
	private String nombreCliente;
	private int numeroCliente;
	private ArrayList<Compra> compras;

	public Cliente(String nombreCliente, int numeroCliente) {
		this.nombreCliente = nombreCliente;
		this.numeroCliente = numeroCliente;
		this.compras = new ArrayList<>();
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroCliente() {
		return this.numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public void agregarCompra(Compra compra){
		compras.add(compra);
	}

	public void mostrarCompras(){
		for(Compra compra : compras){
			System.out.println("compra: " + compra.getIdCompra() + " -Fecha: " + compra.getFechaCompra());
		}
	}
}