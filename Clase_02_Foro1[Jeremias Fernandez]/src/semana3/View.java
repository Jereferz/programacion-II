package semana3;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
		public static int menu() {
			Scanner read = new Scanner(System.in);
			int n = 0;
			System.out.println("1. Create a Contact Book");
			System.out.println("2. Create new Contact");
			System.out.println("3. List of Contact book");
			System.out.println("4. Salir");
			try {
				n = read.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("No letter, No signs");
				System.out.println("Put the correct number!");
			}
			return n;
		} 
		public static void listCB(ContactBook CB) {
			System.out.println("The list of contact");
			System.out.println(CB);
		}
		public static ContactBook createContactBook(ContactBook contactBookNew) {
			Scanner read = new Scanner(System.in);
			System.out.println("Set the name of Contact Book: ");
			String name1 = read.next();
			contactBookNew.setName(name1);
			return contactBookNew;
		}
		public static ContactBook addingContact(ContactBook newcontact) {
			//ArrayList<Contact> newscontacts = new ArrayList<Contact>();
			String name;
			String email;
			String mobil;
			boolean topList=true;
			int num;
			Scanner read = new Scanner(System.in);
			System.out.println("Set new contact");
			System.out.println("Name: ");
			name = read.next();
			System.out.println("Email: ");
			email = read.next();
			System.out.println("Mobil: ");
			mobil = read.next();
			try {
				System.out.println("Favorite:(1/0) ");
				num = read.nextInt();
				switch(num) {
				case 1:
					topList=true;
					break;
				case 0:
					topList=false;
					break;
				}
			}catch (InputMismatchException e) {
				System.out.println("No letter, No signs");
				System.out.println("Put the correct number!");
			}
			
			
			Contact myContact = new Contact(name,email,mobil,topList);
			newcontact.addContact(myContact);
			return newcontact;
		}
}
