package paquete;

public class medicine {

	private int code;
	private String name;
	private int amount;
	private double unit_price;
	
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
	public String toString() {
		return "medicine [code=" + code + ", name=" + name + ", amount=" + amount + ", unit_price=" + unit_price + "]";
	}
	
}
