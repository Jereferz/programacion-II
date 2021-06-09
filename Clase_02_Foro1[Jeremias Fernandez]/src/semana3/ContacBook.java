package semana3;
import java.util.ArrayList;
import java.util.Scanner;

public class ContacBook {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void addContact() {
		ArrayList<Contact> miArrayList = new ArrayList<Contact>();
		Contact myContact;
		String name;
		String email;
		String mobil;
		boolean topList;
		Scanner read = new Scanner(System.in);
		do {
			System.out.println("Name: ");
			name = read.next();
			System.out.println("Email: ");
			email = read.next();
			System.out.println("Mobil: ");
			mobil = read.next();
			System.out.println("Favorite:(1/0 ");
			topList = read.hasNext();
			
			myContact = new Contact(name,email,mobil,topList);
			miArrayList.add(myContact);
			
		}while(!name.equals("fin")||!email.equals("fin"));
	}
	public void delContact() {
		
	}
	public boolean isTheContact(Contact c) {
		
	}
	
	
	
	
}
