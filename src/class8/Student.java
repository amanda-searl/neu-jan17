package class8;

public class Student extends Person {

	private static Object ANSWER_LOCK = new Object();

	public Student(String name) {
		super(name);
	}

	public void answer(String question) {
		execute("thinking", question);
		execute("finding answer", question);
		execute("formulate answer in brain", question);
		sayAnswer(question);
	}

	private void sayAnswer(String question) {
		synchronized (ANSWER_LOCK) {
			System.out.println(getName() + " is answering " + question);
			for (int i = 0; i < 3; i++) {
				System.out.print(getName() + " Answer -> " + i + " ");
				pause(getRandom(50));
			}

			System.out.println("\n" + getName() + " has answered the " + question);
		}
	}

	private void execute(String x, String question) {
		System.out.println(getName() + " is " + x + " for " + question);
		pause(getRandom(100));
	}
}
