package paquete;

public class administrator {
	private int code;
	private String name;
	private String surname;
	private String adress;
	private int phone;
	
	public administrator(int code, String name, String surname, String adress, int phone) {
		super();
		this.code = code;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.phone = phone;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
