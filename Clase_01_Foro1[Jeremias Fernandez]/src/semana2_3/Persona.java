package semana2_3;


public class Persona {
	private String Obra_social;
	private String Nombre;
	private String Apellido;
	
	
	public Persona(String Osocial, String nombre, String apellido) {
		Obra_social = Osocial;
		Nombre = nombre;
		Apellido = apellido;
		
	}
	public String getObra_social() {
		return Obra_social;
	}

	public void setObra_social(String obra_social) {
		Obra_social = obra_social;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	@Override
	public String toString() {
		return "Persona [Obra_social=" + Obra_social + ", Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}
	
}
