package paque1;

public class ciudadano extends persona {
		
	private String Provi; 
	private long DNI;
	
	public ciudadano(String Provi, long DNI, String nombre, String apellido) {
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
