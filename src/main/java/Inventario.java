import java.awt.color.ProfileDataException;
import java.util.HashMap;

public class Inventario {
	private int idInventario;
	private HashMap<Producto, Integer> productos = new HashMap<>();
	private Tienda tienda;

	public Inventario(int idInventario) {
		this.idInventario = idInventario;
	}

	public int getIdInventario() {
		return this.idInventario;
	}

	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}

	public void agregarProducto(Producto producto, int cantidad){
		productos.put(producto,cantidad);
	}

	public void actualizarInventario(Producto producto, int cantidadVendida){
		int cantidadActual = productos.getOrDefault(producto, 0);
		productos.put(producto, cantidadActual - cantidadVendida);
	}

	public void eliminarProducto(Producto producto){
		productos.remove(producto);
	}

	public void mostrarProductos(){
		for (Producto producto : productos.keySet()){
			System.out.println("productos: "+ producto.getIdProducto()+"-"+producto.getCategoria()+"-"+producto.getDescripcion()+"-"+producto.getPrecio());

		}
	}
}