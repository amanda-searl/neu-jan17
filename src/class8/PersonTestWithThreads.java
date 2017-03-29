package class8;

public class PersonTestWithThreads {
	public static void main(String args[]) {
		Person p = new Person("Siva");
		Person pp = new Person("Kevin");
		class Seeable implements Runnable {
			public void run() {
				p.see();
			}
		}
		Seeable s = new Seeable();
		Thread t = new Thread(s);
		t.start();

		ThinkerThread tt = new ThinkerThread(p);
		SpeakerThread st = new SpeakerThread(p);
		System.out.println("START");
		tt.start();
		st.start();
		t.start();
		SpeakerThread kt = new SpeakerThread(pp);
		// pp.speak();
		kt.start();
		System.out.println("DONE");
	}
}
