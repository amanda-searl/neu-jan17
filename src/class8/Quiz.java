package class8;

public class Quiz {

	public static void main(String[] args) {
		Student frank = new Student("Frank");
		Student kevin = new Student("Kevin");
		Student george = new Student("George");

		Thread ft = makeAnswerThread(frank, "What is the capital city of USA");
		Thread kt = makeAnswerThread(kevin, "What is 1 + 2");
		Thread gt = makeAnswerThread(george, "Who is the president of USA");
		ft.start();
		kt.start();
		gt.start();

	}

	private static Thread makeAnswerThread(Student st, String question) {
		return new Thread() {
			public void run() {
				st.answer(question);
			}
		};
	}

}
