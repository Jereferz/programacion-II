package paque1;


public class persona {
	
	private String Apellido;
	private String Nombre;
	
	public persona(String apellido, String nombre) {
		Apellido = apellido;
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public String toString() {
		return "persona [Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}
	
}
