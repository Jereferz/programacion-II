package semana2;

public class Main {

	public static void main(String[] args) {
		Grade grade = new Grade("Instituto de Educacion Superior 9-024 ", "Terciario ","Segundo",11);
		Grade grade1 = new Grade("Instituto de Educacion Superior 9-024 ", "Terciario ","Segundo",11);
		School school = new School("Instituto de Educacion Superior 9-019 ", "Terciario ");
		School school1 = new School("Instituto de Educacion Superior 9-018 ", "Terciario ");
		
		boolean G = grade.equals(grade1);
		boolean S = school.equals(school1);
		System.out.println(G);
		System.out.println(S);
	}

}
