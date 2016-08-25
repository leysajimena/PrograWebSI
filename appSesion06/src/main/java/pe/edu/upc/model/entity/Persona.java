package pe.edu.upc.model.entity;

public class Persona {

	private String DNI;
	private String Nombre;
	private String Genero;
	
	private Grupo oGrupo;//Ref a la clase Grupo
	
	
	public Persona() {
		super();
	}
	
	

	public Grupo getoGrupo() {
		return oGrupo;
	}



	public void setoGrupo(Grupo oGrupo) {
		this.oGrupo = oGrupo;
	}



	public String getDNI() {
		return DNI;
	}

	
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}


}
