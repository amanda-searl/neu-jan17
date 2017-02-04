package encapsulation;

public class Student {
	private String id;
	private String name;
	private String course1;
	private String course2;
	private String course3;

	public String getName() {
		return name;
	}

	private int getRandom(int x) {
		return (int) (Math.random() * x);
	}

	public void listenToLecture() {
		int number = getRandom(15);
		if (number < 5)
			writeTheLessonsInBook();
		if (number > 5 && number < 10)
			memorizeThem();
		if (number > 10)
			ignoreThem();
	}

	private void ignoreThem() {
		System.out.println("Ignore the class");
	}

	private void memorizeThem() {
		System.out.println("Memorize the lecture");
	}

	private void writeTheLessonsInBook() {
		System.out.println("Write the lessons in the book");

	}

	public String getId() {
		return id;
	}

	public void setCourse1(String course) {
		this.course1 = course;
	}

	public String getCourse1() {
		return course1;
	}

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
