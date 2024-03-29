package paquete;

public class Medicine {
	
	private int code;
	private String name;
	private int amount;
	private double unit_price;
	//Contructor de medicinas
	public Medicine(int code, String name, int amount, double unit_price) {
		super();
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.unit_price = unit_price;
	}
	//Getters y Setters de cada atributo
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
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	
	@Override
	
	//Metodo toString de medicinas
	public String toString() {
		return "medicine [code=" + code + ", name=" + name + ", amount=" + amount + ", unit_price=" + unit_price + "]";
	}
	public String toString(String sep) {
		String medic = this.code + sep + this.name + sep + this.amount + sep + this.unit_price;
		return medic;
	}
	
}
