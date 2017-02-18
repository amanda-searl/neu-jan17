package class6;

public class ClassRoom {
	public static void main(String args[]) throws ToughQuestionException, IncompleteAnswerException {
		Student amanda = new Student();
		Student frank = new Student();
		// amanda.comeToClass();
		try {
			amanda.answerQuestion("How is Weather");
			System.out.println("Amanda answered question");
		} catch (Exception te) {
			System.out.println(te.getMessage());
			amanda.answerEasyQuetion("How are you doing");
		}

		try {
			frank.answerQuestion("What is your plan for the weekend");
			System.out.println("Frank answered Question");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			frank.doNothing();
			System.out.println("Incomplete answer -> Keep moving");
		} finally {
			System.out.println("Write Question in his book");
		}
		System.out.println("Start the lecture");

	}
}

class ToughQuestionException extends Exception {
}

class IncompleteAnswerException extends Exception {
}

class Student {

	public void answerEasyQuetion(String question) {
		System.out.println("Answer Easy Question -> " + question);
	}

	public void doNothing() {

	}

	public void answerQuestion(String question) throws ToughQuestionException, IncompleteAnswerException {
		int x = getRandomNumber(100);
		if (x < 10) {
			ToughQuestionException te = new ToughQuestionException();
			throw te;
		}
		if (x > 10 && x < 50) {
			IncompleteAnswerException ae = new IncompleteAnswerException();
			throw ae;
		}
		System.out.println("Answer Question -> " + question);
	}

	public void comeToClass() {
		stepOutOfTheDoor();
		try {
			walkUptoBusStop();
			getIntoBus();
		} catch (Exception e) {
			System.out.println("Call a Friend to drop me to the university");
		}
		getDownAtUniversityBusStop();
		walkUptoClassRoom();
	}

	private void walkUptoClassRoom() {

		try {
			prnt("Walk upto class room");
			System.out.println("Get into elevator");
		} catch (Exception e) {
			System.out.println("It's raining but I will run fast to class room");
		}
		System.out.println("Get into the class room");
	}

	int getRandomNumber(int a) {
		return (int) (Math.random() * a);
	}

	private void prnt(String string) throws Exception {
		int x = getRandomNumber(100);
		if (x < 25) {
			// System.out.println("It is raining");

			Exception re = new Exception("It is raining");
			// re.printStackTrace();
			System.out.println("-----Exception-------" + re.getMessage());
			throw re;
		}
		System.out.println(string);

	}

	private void getDownAtUniversityBusStop() {
		try {
			prnt("Get down at university bus stop");
		} catch (Exception e) {
			System.out.println("Wait in the bus stop");
		}

	}

	private void getIntoBus() throws Exception {
		prnt("Get Into Bus");

	}

	private void walkUptoBusStop() throws Exception {
		prnt("Walk upto Bus Stop");

	}

	private void stepOutOfTheDoor() {
		try {
			prnt("Step out of the door");
		} catch (Exception e) {
			System.out.println("Take an Umbrella from Home");
		}

	}
}
