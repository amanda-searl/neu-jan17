package class8;

public class PersonEatingTest {

	public static void main(String[] args) {
		Person p = new Person("Kevin");
		EatingThread et = new EatingThread(p);
		SpeakerThread st = new SpeakerThread(p);
		//ThinkerThread tt = new ThinkerThread(p);
		et.start();
		st.start();
		//tt.start();
	}

}
