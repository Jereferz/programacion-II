package semana2_3;

public class Ciudadano extends Persona {
		
	private String Provi; 
	private long DNI;
	
	public Ciudadano(String nombre, String apellido,String Provin, long dnii) {
		super( nombre, apellido);
		this.Provi = Provin;
		this.DNI = dnii;
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
		public String toString() {
		String mensaje ="Provincia: "+ Provi+" DNI: "+DNI;
		return mensaje;
	}

}
