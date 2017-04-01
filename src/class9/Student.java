package class9;

public class Student {
	private String name;
	private String roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String toWriteableString() {
		return roll + "|" + name;
	}

	public void fromWriteableString(String string) {
		String x[] = string.split("\\|");
		setRoll(x[0]);
		setName(x[1]);
	}

	public String toString() {
		return "Name -> " + name + " Roll -> " + roll;
	}

	public static void main(String args[]) {
		Student s = new Student();
		s.fromWriteableString("102|Siva");
		System.out.println(s);
		s.setName("Kumar");
		System.out.println(s.toWriteableString());
	}
}
