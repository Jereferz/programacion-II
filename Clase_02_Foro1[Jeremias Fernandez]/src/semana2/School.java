package semana2;

public class School {
	protected String Name;
	protected String Level;
	
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
	public boolean equals(Object o) {
		School otraschool = (School) o;
		return (otraschool.Name == Name)&&(otraschool.Level == Level);
	}
}
