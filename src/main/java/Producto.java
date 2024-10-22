import java.util.ArrayList;

public class Producto {
	private int idProducto;
	private String descripcion;
	private double precio;
	private String categoria;
	private Inventario inventario;
	private ArrayList<Compra> compra = new ArrayList<Compra>();
	private Ciudad ciudad;

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void agregarProducto() {
		throw new UnsupportedOperationException();
	}

	public void modificarOEliminarProducto() {
		throw new UnsupportedOperationException();
	}

	public void actualizarInventario() {
		throw new UnsupportedOperationException();
	}

	public void mostrarProductos() {
		throw new UnsupportedOperationException();
	}

	public void mostrarInventario() {
		throw new UnsupportedOperationException();
	}
}