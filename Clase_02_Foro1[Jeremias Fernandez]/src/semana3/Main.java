package semana3;

public class Main {

	public static void main(String[] args) {
		ContactBook booknew;
		int o = 0;
		do {
			o = View.menu();
			if (o == 1) {
				booknew = View.createContactBook(new ContactBook());
				System.out.println(booknew);
			}
		}while(o!=4);
		
	}

}
