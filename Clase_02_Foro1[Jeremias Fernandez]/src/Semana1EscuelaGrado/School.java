package Semana1EscuelaGrado;

public class School {
	private String Name;
	private String Level;
	
	public School(String Name, String Level) {
		this.Name = Name;
		this.Level = Level;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	@Override
	public String toString() {
		return "Escuela [Name=" + Name + ", Level=" + Level + "]";
	}
	
}
