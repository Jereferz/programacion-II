package semana2_3;

public class Ciudadano extends Persona {
		
	private String Provi; 
	private long DNI;
	private long N_afiliado;
	
	public Ciudadano(String obra_social, String nombre, String apellido,String Provin, long dnii, long afiliado) {
		super(obra_social, nombre, apellido);
		this.Provi = Provin;
		this.DNI = dnii;
		this.N_afiliado = afiliado;
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

	public long getN_afiliado() {
		return N_afiliado;
	}
	public void setN_afiliado(long n_afiliado) {
		N_afiliado = n_afiliado;
	}
	@Override
	public String toString() {
		return "Ciudadano [Provincia=" + Provi + ", DNI=" + DNI + ", Numero de afiliado=" + N_afiliado + "]";
	}

}
