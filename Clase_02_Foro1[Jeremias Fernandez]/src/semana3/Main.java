package semana3;


public class Main {

	public static void main(String[] args) {
		ContactBook booknew= null;
		int o = 0;
		do {
			o = View.menu();
			if (o == 1) {
				booknew = View.createContactBook(new ContactBook());
				System.out.println(booknew);
			}else if (o == 2) {
				ContactBook contact1 = View.addingContact(booknew);
				String st_contacto = contact1.toString("#");
				System.out.println(st_contacto);
				//DataModel.saveCB(booknew);
			} else if (o == 3) {
				View.listCB(booknew);
			}
		}while(o!=4);
		
	}

}
