package paque1;

public class Ciudadano extends Persona {
		
	private String Provi; 
	private long DNI;
	
	public Ciudadano(String nombre, String apellido,String Provi, long DNI) {
		super( nombre, apellido);
		this.Provi = Provi;
		this.DNI = DNI;
	}

	public String getProvincia() {
		return Provi;
	}
	
	public void setProvincia(String Provi) {
		this.Provi = Provi;
	}
	
	public long getDni() {
		return DNI;
	}
	
	public void setDni(long DNI) {
		this.DNI = DNI;	
	}
}
