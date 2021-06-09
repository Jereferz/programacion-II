package semana3;
import java.util.Scanner;

public class View {
		public static void createContactBook(ContactBook) {
		
	}
		public static int menu() {
			Scanner read = new Scanner(System.in);
			System.out.println("1. Create a Contact Book");
			System.out.println("2. No");
			int n = read.nextInt();
			return n;
		}

}
