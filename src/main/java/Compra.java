import java.util.ArrayList;

public class Compra {
	private int idCompra;
	private String fechaCompra;
	private double montoTotal;
	private String metodoPago;
	private ArrayList<Producto> productos;
	private Cliente cliente;
	private Tienda tienda;

	public Compra(int idCompra, String fechaCompra, double montoTotal, String metodoPago,Cliente cliente, Tienda tienda) {
		this.idCompra = idCompra;
		this.fechaCompra = fechaCompra;
		this.montoTotal = montoTotal;
		this.metodoPago = metodoPago;
		this.cliente = cliente;
		this.tienda = tienda;
		this.productos = new ArrayList<>();
	}

	public int getIdCompra() {
		return this.idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public String getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public double getMontoTotal() {
		return this.montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getMetodoPago() {
		return this.metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public void mostrarCompras() {
		System.out.println("Compra ID: " + idCompra + " - Fecha: " + fechaCompra + " - Total: " + montoTotal);
		for (Producto producto : productos) {
			System.out.println("Producto: " + producto.getDescripcion() + " - Precio: " + producto.getPrecio());
		}
	}
}