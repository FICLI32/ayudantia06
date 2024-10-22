import java.util.ArrayList;

public class Territorio {
	private String pais;
	private ArrayList<Region> regiones = new ArrayList<Region>();

	public Territorio(String pais) {
		this.pais = pais;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void agregarRegion(Region region) {
		regiones.add(region);
	}

	public void modificarRegion(int indice, Region nuevaRegion) {
		regiones.set(indice,nuevaRegion);
	}

	public void EliminarRegion(Region region){
		regiones.remove(region);
	}

	public void mostrarRegionesYCiudades() {
		for(Region region :regiones){
			System.out.println("Region: " + region.getNombreRegion());
			for (Ciudad ciudad : region.getCiudades()){
				System.out.println("Ciudad: " + ciudad.getNombreCiudad() + ", Codigo Postal: " + ciudad.getCodigoPostal());
			}
		}
	}

}