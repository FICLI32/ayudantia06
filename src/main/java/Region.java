import java.util.ArrayList;

public class Region {
	private String nombreRegion;
	private Territorio territorio;
	private ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

	public Region(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public String getNombreRegion() {
		return this.nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public ArrayList<Ciudad> getCiudades(){
		return this.ciudades;
	}

	public void agregarCiudad(Ciudad ciudad){
		ciudades.add(ciudad);
	}

	public void modificarCiudad(int indice, Ciudad nuevaCiudad){
		ciudades.set(indice, nuevaCiudad);
	}

	public void eliminarCiudad(Ciudad ciudad){
		ciudades.remove(ciudad);
	}

}