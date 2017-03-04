package class6;

public class ExceptionTests {

	public static void doIt() {
		doIt();
	}

	public static void main(String[] args) /* throws Exception */ {
		Professor p = null;
		try {
			doIt();
		} catch (StackOverflowError sfe) {
			System.out.println("Recursion error");
		}
		System.out.println("Move on..");
		// p.answer();

		p = new Professor();
		try {
			p.speak();
			p.speak();
			p.speak();

		} catch (LanguageException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Professor is speaking in a different language");

		} finally {
			p.pause();
		}
		p.answer();

	}

}

class LanguageException extends Exception {

}

class Professor {
	void speak() throws LanguageException {
		if (getRandom(10) > 5) {
			throw new LanguageException();
		}
		System.out.println("Speaking");

	}

	void pause() {
		System.out.println("Professor is pausing");
	}

	int getRandom(int x) {

		int a = (int) (Math.random() * x);
		// System.out.println("Random number -> " + a);
		return a;
	}

	void answer() {
		System.out.println("Answering");
	}
}
