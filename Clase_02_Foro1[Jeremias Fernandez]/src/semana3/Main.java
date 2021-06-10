package semana3;

public class Main {

	public static void main(String[] args) {
		
		int o = View.menu();
		System.out.println(o);
		
		ContactBook booknew = View.createContactBook(new ContactBook());
		System.out.println(booknew);
		
	}

}
