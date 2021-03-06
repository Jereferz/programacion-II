package semana1act2;

public class Grade extends School {
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
		return "[Name School= "+super.getName()+"Level school= "+super.getLevel()+"] "+"[Grade Course= " + Stud + ", Amount of students= " + AmountStud + "]";
	}
}
