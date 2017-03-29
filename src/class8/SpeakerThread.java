package class8;

class SpeakerThread extends Thread {
	private Person p;

	public SpeakerThread(Person p) {
		this.p = p;
	}

	public void run() {
		p.speak();
	}
}