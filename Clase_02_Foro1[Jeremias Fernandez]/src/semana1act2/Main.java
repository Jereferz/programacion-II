package semana1act2;

public class Main {

	public static void main(String[] args) {
		Grade grade = new Grade("Instituto de Educacion Superior 9-024 ", "Terciario ","Segundo",11);
		System.out.println(grade);
		System.out.println("");
		School school = (School) grade;
		System.out.println(school);
		System.out.println("");
		School school1 = new School("Instituto de Educacion Superior 9-019 ", "Terciario ");
		System.out.println(school1);
		Grade grade1 = (Grade) school1;
		System.out.println(grade1);
	}
}
