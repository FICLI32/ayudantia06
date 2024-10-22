import java.util.ArrayList;

public class Ciudad {
	private String nombreCiudad;
	private String codigoPostal;
	private Region region;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Tienda> tiendas = new ArrayList<Tienda>();

	public String getNombreCiudad() {
		return this.nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void agregarTienda(Tienda tienda){
		tiendas.add(tienda);
	}

	public void modificarTienda(int indice,Tienda tienda){
		tiendas.set(indice,tienda);
	}

	public void  eliminarTienda(Tienda tienda){
		tiendas.remove(tienda);
	}
	public void mostrarTiendas(){
		for (Tienda tienda : tiendas){
			System.out.println("Tienda: " + tienda.getNombreTienda() + " -direccion: " + tienda.getDireccion());
		}
	}
}