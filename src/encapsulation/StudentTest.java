package encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student jia = new Student("12345", "Jia");
		jia.setCourse1("Java");
		System.out.println(jia.getCourse1());
		jia.setCourse1("Algorithms");
		System.out.println(jia.getCourse1());
		jia.listenToLecture();
		jia.listenToLecture();
		jia.listenToLecture();
		
	}

}
