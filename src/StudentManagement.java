
public class StudentManagement {
	public boolean haveTheSameGPA(Student one, Student two) {
		if (one.gpa == two.gpa) {
			return true;
		} else {
			return false;
		}
	}

	public float averageGPA(Student one, Student two) {
		return (one.gpa + two.gpa) / 2;
	}

	public boolean isAGrade(Student one) {
		if (one.gpa >= 3.75f) {
			return true;
		}
		return false;
	}

	public String convertBooleanToYesOrNo(boolean b) {
		if (b == true) {
			return "Yes";
		} else {
			return "No";
		}
	}
}
