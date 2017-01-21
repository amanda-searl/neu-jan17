
public class StudentTest {

	public static void main(String[] args) {
		Student amanda = new Student();
		Student kevin = new Student();
		amanda.gpa = 3.43f;
		kevin.gpa = 3.97f;

		StudentManagement sm = new StudentManagement();
		System.out.println(sm.averageGPA(amanda, kevin));
		boolean aGradeCheck = sm.isAGrade(kevin);
		System.out.println(sm.convertBooleanToYesOrNo(aGradeCheck));
		System.out.println(sm.haveTheSameGPA(kevin, amanda));

		System.out.println(amanda.getGrade());
	}

}
