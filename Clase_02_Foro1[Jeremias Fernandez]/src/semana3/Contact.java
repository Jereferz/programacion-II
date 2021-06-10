package semana3;

public class Contact {
	private String name;
	private String email;
	private String mobil;
	private boolean topList;
	
	public Contact(String name, String email, String mobil, boolean topList) {
		super();
		this.name = name;
		this.email = email;
		this.mobil = mobil;
		this.topList = topList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public boolean isTopList() {
		return topList;
	}

	public void setTopList(boolean topList) {
		this.topList = topList;
	}
	public boolean equals(Object o) {
		Contact otherContact = (Contact) o;
		return (otherContact.name == name)&&(otherContact.mobil==mobil);
	}
	
	@Override
	public String toString() {
		return "Contact [Name=" + name + ", Email=" + email + ", Mobil=" + mobil + ", Favorite=" + topList + "]";
	}

	
	
	
}
