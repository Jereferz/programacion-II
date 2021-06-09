package semana2;

public class Grade extends School{
	private String Stud;
	private int AmountStud;
	
	public Grade(String Name,String Level,String Stud,int AmountStud) {
		super (Name,Level);
		this.Stud = Stud;
		this.AmountStud = AmountStud; 
	}

	public String getStud() {
		return Stud;
	}

	public void setStud(String stud) {
		Stud = stud;
	}

	public int getAmountStud() {
		return AmountStud;
	}

	public void setAmountStud(int amountStud) {
		AmountStud = amountStud;
	}

	@Override
	public String toString() {
		return "[Name School= "+Name+"Level school= "+Level+"] "+"[Grade Course= " + Stud + ", Amount of students= " + AmountStud + "]";
	}
	public boolean equals(Object o) {
		Grade otrograde = (Grade) o;
		return (otrograde.Stud == Stud)&&(otrograde.AmountStud==AmountStud);
	}
}
