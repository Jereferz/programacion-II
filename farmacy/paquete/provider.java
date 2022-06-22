package paquete;

import java.util.ArrayList;

public class provider {
	private int code;
	private String name;
	private int phone;
	private String adress;
	private ArrayList<medicine> newmedicine;
	
	public provider(int code, String name, int phone, String adress) {
		super();
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.adress = adress;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	//Metodos para agregar y eliminar medicinas del array
	public void addMedicine(medicine m) {
		newmedicine.add(m);
	}
	public void delMedicine(medicine m) {
		newmedicine.remove(m);
	}
	
	
}
