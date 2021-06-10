package semana3;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
		public static int menu() {
			Scanner read = new Scanner(System.in);
			System.out.println("1. Create a Contact Book");
			System.out.println("2. Create new Contact");
			System.out.println("3. Delete a Conctact");
			int n = read.nextInt();
			return n;
		} 
		public static ContactBook createContactBook(ContactBook contactBookNew) {
			Scanner read = new Scanner(System.in);
			System.out.println("Set the name of Contact Book: ");
			String name1 = read.next();
			contactBookNew.setName(name1);
			return contactBookNew;
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
				
			}while(!name.equals("end")||!email.equals("end"));
		}
}
