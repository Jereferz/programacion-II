package semana3;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
	private String name;
	private ArrayList<Contact> newscontacts;
	
	public ContactBook() {
		newscontacts = new ArrayList<Contact>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addContact(Contact c) {
		newscontacts.add(c);
		return;
	}
	public void delContact(Contact c) {
		newscontacts.remove(c);
		return;
	}
	public boolean isTheContact(Contact c) {
		Contact otherContact=(Contact) c;
		return true;
	}
	@Override
	public String toString() {
		String cont = "";
		for (int i=0;i<newscontacts.size();i++) {
			cont = cont+newscontacts.get(i).toString();
		}
		return "The name of Contact Book is [" + this.name + "]"+cont;
	}
	public String toString(String sep) {
		String cont = "";
		for (int i=0;i<newscontacts.size();i++) {
			cont = cont+newscontacts.get(i).toString("#")+sep;
		}
		return cont;
	}
	
	
	
}
